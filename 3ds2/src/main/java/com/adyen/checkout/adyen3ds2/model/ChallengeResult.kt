/*
 * Copyright (c) 2019 Adyen N.V.
 *
 * This file is open source and available under the MIT license. See the LICENSE file for more info.
 *
 * Created by caiof on 14/5/2019.
 */
package com.adyen.checkout.adyen3ds2.model

import com.adyen.checkout.components.encoding.Base64Encoder
import org.json.JSONException
import org.json.JSONObject

class ChallengeResult private constructor(val isAuthenticated: Boolean, val payload: String) {

    companion object {
        private const val KEY_TRANSACTION_STATUS = "transStatus"
        private const val KEY_AUTHORISATION_TOKEN = "authorisationToken"
        private const val VALUE_TRANSACTION_STATUS = "Y"

        private const val KEY_SDK_ERROR = "threeDS2SDKError"

        /**
         * Constructs the object base in the result from te 3DS2 SDK.
         *
         * @param transactionStatus The transaction status received in the result from the 3DS2 SDK.
         * @param errorDetails The additional error details received in the result from the 3DS2 SDK.
         * @param authorisationToken The authorisationToken from the API.
         * @return The filled object with the content needed for the details response.
         * @throws JSONException In case parsing fails.
         */
        fun from(
            transactionStatus: String,
            errorDetails: String? = null,
            authorisationToken: String? = null
        ): ChallengeResult {
            val isAuthenticated = VALUE_TRANSACTION_STATUS == transactionStatus
            val jsonObject = JSONObject()
            jsonObject.put(KEY_TRANSACTION_STATUS, transactionStatus)
            jsonObject.putOpt(KEY_AUTHORISATION_TOKEN, authorisationToken)
            jsonObject.putOpt(KEY_SDK_ERROR, errorDetails)
            val payload = Base64Encoder.encode(jsonObject.toString())
            return ChallengeResult(isAuthenticated, payload)
        }
    }
}
