/*
 * Copyright (c) 2019 Adyen N.V.
 *
 * This file is open source and available under the MIT license. See the LICENSE file for more info.
 *
 * Created by caiof on 27/8/2020.
 */

package com.adyen.checkout.bcmc;

import androidx.annotation.NonNull;

import com.adyen.checkout.card.data.ExpiryDate;
import com.adyen.checkout.components.base.InputData;

public final class BcmcInputData implements InputData {
    private String mCardNumber = "";
    private ExpiryDate mExpiryDate = ExpiryDate.EMPTY_DATE;
    private String mCardHolderName = "";
    private boolean mIsStorePaymentSelected = false;

    @NonNull
    public String getCardNumber() {
        return mCardNumber;
    }

    public void setCardNumber(@NonNull String cardNumber) {
        mCardNumber = cardNumber;
    }

    @NonNull
    public ExpiryDate getExpiryDate() {
        return mExpiryDate;
    }

    public void setExpiryDate(@NonNull ExpiryDate expiryDate) {
        mExpiryDate = expiryDate;
    }

    @NonNull
    public String getCardHolderName() {
        return mCardHolderName;
    }

    public void setCardHolderName(@NonNull String cardHolderName) {
        mCardHolderName = cardHolderName;
    }

    public boolean isStorePaymentSelected() {
        return mIsStorePaymentSelected;
    }

    public void setStorePaymentSelected(boolean storePaymentSelected) {
        mIsStorePaymentSelected = storePaymentSelected;
    }
}
