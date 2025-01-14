/*
 * Copyright (c) 2022 Adyen N.V.
 *
 * This file is open source and available under the MIT license. See the LICENSE file for more info.
 *
 * Created by atef on 21/9/2022.
 */

package com.adyen.checkout.onlinebankingpl

import android.content.Context
import android.util.AttributeSet
import com.adyen.checkout.components.model.payments.request.OnlineBankingPLPaymentMethod
import com.adyen.checkout.issuerlist.IssuerListSpinnerView

class OnlineBankingPLSpinnerView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : IssuerListSpinnerView<OnlineBankingPLPaymentMethod, OnlineBankingPLComponent>(context, attrs, defStyleAttr)
