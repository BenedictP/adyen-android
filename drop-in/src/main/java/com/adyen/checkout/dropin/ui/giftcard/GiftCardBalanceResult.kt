/*
 * Copyright (c) 2021 Adyen N.V.
 *
 * This file is open source and available under the MIT license. See the LICENSE file for more info.
 *
 * Created by josephj on 11/11/2021.
 */

package com.adyen.checkout.dropin.ui.giftcard

import androidx.annotation.StringRes
import com.adyen.checkout.components.model.payments.Amount

sealed class GiftCardBalanceResult {
    class FullPayment(val data: GiftCardPaymentConfirmationData) : GiftCardBalanceResult()
    class PartialPayment(val amountPaid: Amount, val remainingBalance: Amount) : GiftCardBalanceResult()
    class Error(@StringRes val errorMessage: Int, val reason: String, val terminateDropIn: Boolean) : GiftCardBalanceResult()
}