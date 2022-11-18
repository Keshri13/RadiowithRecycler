package com.example.finaldemo.Models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Access {

    @SerializedName("AcceptExpiredStoreCredit")
    @Expose
    private Boolean acceptExpiredStoreCredit;
    @SerializedName("AcceptLostStoreCredit")
    @Expose
    private Boolean acceptLostStoreCredit;
    @SerializedName("AcceptTillCountDiscrepancy")
    @Expose
    private Boolean acceptTillCountDiscrepancy;
    @SerializedName("AccessOtherTills")
    @Expose
    private Boolean accessOtherTills;
    @SerializedName("AddCommentinJournal")
    @Expose
    private Boolean addCommentinJournal;
    @SerializedName("AddCustomertoSale")
    @Expose
    private Boolean addCustomertoSale;
    @SerializedName("AddDiscount")
    @Expose
    private Boolean addDiscount;
    @SerializedName("AdministerOperatingSystem(grantscommandpromptaccess)")
    @Expose
    private Boolean administerOperatingSystemGrantscommandpromptaccess;
    @SerializedName("MposDashboard")
    @Expose
    private Boolean mposDashboard;
    @SerializedName("AdministrativeWorkCode")
    @Expose
    private Boolean administrativeWorkCode;
    @SerializedName("AllowEmployeeSale")
    @Expose
    private Boolean allowEmployeeSale;
    @SerializedName("AllowExpiredCouponOverride")
    @Expose
    private Boolean allowExpiredCouponOverride;
    @SerializedName("AllowForeignChangeAboveAvailableFunds")
    @Expose
    private Boolean allowForeignChangeAboveAvailableFunds;
    @SerializedName("AllowInactiveCouponOverride")
    @Expose
    private Boolean allowInactiveCouponOverride;
    @SerializedName("AssociateAdvance")
    @Expose
    private Boolean associateAdvance;
    @SerializedName("AssociateMaintenance")
    @Expose
    private Boolean associateMaintenance;
    @SerializedName("AttachCashDrawerTill")
    @Expose
    private Boolean attachCashDrawerTill;
    @SerializedName("AttachOtherTill")
    @Expose
    private Boolean attachOtherTill;
    @SerializedName("AttachTill")
    @Expose
    private Boolean attachTill;
    @SerializedName("BackofficeAccess")
    @Expose
    private Boolean backofficeAccess;
    @SerializedName("BlindReturnsThresholdAmount")
    @Expose
    private Boolean blindReturnsThresholdAmount;
    @SerializedName("CancelLayaway")
    @Expose
    private Boolean cancelLayaway;
    @SerializedName("CancelTransaction")
    @Expose
    private Boolean cancelTransaction;
    @SerializedName("CannotBeLockedOut")
    @Expose
    private Boolean cannotBeLockedOut;
    @SerializedName("CashChangeDueLimit")
    @Expose
    private Boolean cashChangeDueLimit;
    @SerializedName("CashPickup")
    @Expose
    private Boolean cashPickup;
    @SerializedName("CashTransfer")
    @Expose
    private Boolean cashTransfer;
    @SerializedName("ChangeDiscount")
    @Expose
    private Boolean changeDiscount;
    @SerializedName("ChangePasswordofOtherUser")
    @Expose
    private Boolean changePasswordofOtherUser;
    @SerializedName("ChangePrice")
    @Expose
    private Boolean changePrice;
    @SerializedName("ChangePriceonVerifiedReturn")
    @Expose
    private Boolean changePriceonVerifiedReturn;
    @SerializedName("ChangeQuantity")
    @Expose
    private Boolean changeQuantity;
    @SerializedName("ChangeTillFloat")
    @Expose
    private Boolean changeTillFloat;
    @SerializedName("CheckforUpdates")
    @Expose
    private Boolean checkforUpdates;
    @SerializedName("CloseStorewithSuspendedSales")
    @Expose
    private Boolean closeStorewithSuspendedSales;
    @SerializedName("CreateCustomer")
    @Expose
    private Boolean createCustomer;
    @SerializedName("CustomernotpresenttenderManagerOverride")
    @Expose
    private Boolean customernotpresenttenderManagerOverride;
    @SerializedName("EndCountOtherTill")
    @Expose
    private Boolean endCountOtherTill;
    @SerializedName("ExceedMaximumDiscount")
    @Expose
    private Boolean exceedMaximumDiscount;
    @SerializedName("ForManulDiscount")
    @Expose
    private Boolean forManulDiscount;
    @SerializedName("ForPriceOverride")
    @Expose
    private Boolean forPriceOverride;
    @SerializedName("ForceCloseReplenishment")
    @Expose
    private Boolean forceCloseReplenishment;
    @SerializedName("ForceRedemptionofCoupon")
    @Expose
    private Boolean forceRedemptionofCoupon;
    @SerializedName("IssueInvoiceFromEJ")
    @Expose
    private Boolean issueInvoiceFromEJ;
    @SerializedName("IssueTill")
    @Expose
    private Boolean issueTill;
    @SerializedName("KeepCashDrawerOpen")
    @Expose
    private Boolean keepCashDrawerOpen;
    @SerializedName("LayawayItemPriceBelowMinimum")
    @Expose
    private Boolean layawayItemPriceBelowMinimum;
    @SerializedName("Login")
    @Expose
    private Boolean login;
    @SerializedName("LogintoSystem")
    @Expose
    private Boolean logintoSystem;
    @SerializedName("LogintoXenvironment")
    @Expose
    private Boolean logintoXenvironment;
    @SerializedName("MaintainCurrencyExchangeRates")
    @Expose
    private Boolean maintainCurrencyExchangeRates;
    @SerializedName("ManageNetworkedCashDrawers")
    @Expose
    private Boolean manageNetworkedCashDrawers;
    @SerializedName("ManageTills")
    @Expose
    private Boolean manageTills;
    @SerializedName("ManualOverrideforAccountReceivable")
    @Expose
    private Boolean manualOverrideforAccountReceivable;
    @SerializedName("ManulEntryforPointRedeemption")
    @Expose
    private Boolean manulEntryforPointRedeemption;
    @SerializedName("MobileClientDeviceAccess")
    @Expose
    private Boolean mobileClientDeviceAccess;
    @SerializedName("NeedtocomefromtheTenderModetoItemMode")
    @Expose
    private Boolean needtocomefromtheTenderModetoItemMode;
    @SerializedName("NoSale")
    @Expose
    private Boolean noSale;
    @SerializedName("OTPFailureaskedforManageroverride")
    @Expose
    private Boolean oTPFailureaskedforManageroverride;
    @SerializedName("OpenStoreBank")
    @Expose
    private Boolean openStoreBank;
    @SerializedName("OverrideBlindReturnPrice")
    @Expose
    private Boolean overrideBlindReturnPrice;
    @SerializedName("OverrideCancelLayawaytoEscrow")
    @Expose
    private Boolean overrideCancelLayawaytoEscrow;
    @SerializedName("OverrideCancelSpecialOrdertoEscrow")
    @Expose
    private Boolean overrideCancelSpecialOrdertoEscrow;
    @SerializedName("OverrideLayawayDeposit")
    @Expose
    private Boolean overrideLayawayDeposit;
    @SerializedName("OverrideMaximumEnteredReceivingQuantity")
    @Expose
    private Boolean overrideMaximumEnteredReceivingQuantity;
    @SerializedName("OverrideOnHoldDepositAmount")
    @Expose
    private Boolean overrideOnHoldDepositAmount;
    @SerializedName("OverrideforEnteringFlightInformation")
    @Expose
    private Boolean overrideforEnteringFlightInformation;
    @SerializedName("OvertenderAboveMaximum")
    @Expose
    private Boolean overtenderAboveMaximum;
    @SerializedName("PerformtheEnd-Of-Dayprocess")
    @Expose
    private Boolean performtheEndOfDayprocess;
    @SerializedName("PostVoidTransactioninBackOffice")
    @Expose
    private Boolean postVoidTransactioninBackOffice;
    @SerializedName("PostVoidTransactioninRegister")
    @Expose
    private Boolean postVoidTransactioninRegister;
    @SerializedName("PostVoidanInvoiceFromEJ")
    @Expose
    private Boolean postVoidanInvoiceFromEJ;
    @SerializedName("PostVoidfromJournal")
    @Expose
    private Boolean postVoidfromJournal;
    @SerializedName("PostVoidshouldbedoneinPOS")
    @Expose
    private Boolean postVoidshouldbedoneinPOS;
    @SerializedName("PrintCustomerDetails")
    @Expose
    private Boolean printCustomerDetails;
    @SerializedName("ReconcileStoreBank")
    @Expose
    private Boolean reconcileStoreBank;
    @SerializedName("ReconcileTill")
    @Expose
    private Boolean reconcileTill;
    @SerializedName("Reconciletillsessionincashdraweraccountability")
    @Expose
    private Boolean reconciletillsessionincashdraweraccountability;
    @SerializedName("Reconciletillsessioninregisteraccountability")
    @Expose
    private Boolean reconciletillsessioninregisteraccountability;
    @SerializedName("RefundMoreCashThanAvailable")
    @Expose
    private Boolean refundMoreCashThanAvailable;
    @SerializedName("RefundTenderBalance")
    @Expose
    private Boolean refundTenderBalance;
    @SerializedName("ReloadGiftCard")
    @Expose
    private Boolean reloadGiftCard;
    @SerializedName("RemoveCashDrawerTill")
    @Expose
    private Boolean removeCashDrawerTill;
    @SerializedName("RemoveOtherTill")
    @Expose
    private Boolean removeOtherTill;
    @SerializedName("RemoveOwnTill")
    @Expose
    private Boolean removeOwnTill;
    @SerializedName("ReprintInvoiceFromEJ")
    @Expose
    private Boolean reprintInvoiceFromEJ;
    @SerializedName("ReprintLastInvoice")
    @Expose
    private Boolean reprintLastInvoice;
    @SerializedName("ReprintReceiptfromJournal")
    @Expose
    private Boolean reprintReceiptfromJournal;
    @SerializedName("ReprintReceiptfromPreviousDay")
    @Expose
    private Boolean reprintReceiptfromPreviousDay;
    @SerializedName("ReturnGiftCard")
    @Expose
    private Boolean returnGiftCard;
    @SerializedName("ReturnItem")
    @Expose
    private Boolean returnItem;
    @SerializedName("ReturnItemNotinOriginalSale")
    @Expose
    private Boolean returnItemNotinOriginalSale;
    @SerializedName("ReturnItemOverMaximumPrice")
    @Expose
    private Boolean returnItemOverMaximumPrice;
    @SerializedName("ReturnItemUnderMinimumPrice")
    @Expose
    private Boolean returnItemUnderMinimumPrice;
    @SerializedName("ReturnMoreThanQuantityPurchased")
    @Expose
    private Boolean returnMoreThanQuantityPurchased;
    @SerializedName("ReturnNon-MerchandiseItem")
    @Expose
    private Boolean returnNonMerchandiseItem;
    @SerializedName("ReturnTill")
    @Expose
    private Boolean returnTill;
    @SerializedName("ReturnUnreturnableItem")
    @Expose
    private Boolean returnUnreturnableItem;
    @SerializedName("ReturnUnreturnableItemAfterMaxDays")
    @Expose
    private Boolean returnUnreturnableItemAfterMaxDays;
    @SerializedName("SellGiftCard")
    @Expose
    private Boolean sellGiftCard;
    @SerializedName("SellGiftCertificate")
    @Expose
    private Boolean sellGiftCertificate;
    @SerializedName("SellItem")
    @Expose
    private Boolean sellItem;
    @SerializedName("SellItemNotonFile")
    @Expose
    private Boolean sellItemNotonFile;
    @SerializedName("SellNon-MerchandiseItem")
    @Expose
    private Boolean sellNonMerchandiseItem;
    @SerializedName("StartofDay/EndofDay")
    @Expose
    private Boolean startofDayEndofDay;
    @SerializedName("Stockfilegeneration")
    @Expose
    private Boolean stockfilegeneration;
    @SerializedName("StoreBankCashDeposit")
    @Expose
    private Boolean storeBankCashDeposit;
    @SerializedName("SuspendTransaction")
    @Expose
    private Boolean suspendTransaction;
    @SerializedName("TILLOption")
    @Expose
    private Boolean tILLOption;
    @SerializedName("TenderAboveAllowedAmount")
    @Expose
    private Boolean tenderAboveAllowedAmount;
    @SerializedName("TransactionManualDiscountLimit")
    @Expose
    private Boolean transactionManualDiscountLimit;
    @SerializedName("UnlockRegister")
    @Expose
    private Boolean unlockRegister;
    @SerializedName("ViewCustomerDetails")
    @Expose
    private Boolean viewCustomerDetails;
    @SerializedName("VoidLineItem")
    @Expose
    private Boolean voidLineItem;
    @SerializedName("VoidTender")
    @Expose
    private Boolean voidTender;
    @SerializedName("XfgShowcodefunctions")
    @Expose
    private Boolean xfgShowcodefunctions;
    @SerializedName("XfgVoidthelastitemsold")
    @Expose
    private Boolean xfgVoidthelastitemsold;

    public Boolean getAcceptExpiredStoreCredit() {
        return acceptExpiredStoreCredit;
    }

    public void setAcceptExpiredStoreCredit(Boolean acceptExpiredStoreCredit) {
        this.acceptExpiredStoreCredit = acceptExpiredStoreCredit;
    }

    public Boolean getAcceptLostStoreCredit() {
        return acceptLostStoreCredit;
    }

    public void setAcceptLostStoreCredit(Boolean acceptLostStoreCredit) {
        this.acceptLostStoreCredit = acceptLostStoreCredit;
    }

    public Boolean getAcceptTillCountDiscrepancy() {
        return acceptTillCountDiscrepancy;
    }

    public void setAcceptTillCountDiscrepancy(Boolean acceptTillCountDiscrepancy) {
        this.acceptTillCountDiscrepancy = acceptTillCountDiscrepancy;
    }

    public Boolean getAccessOtherTills() {
        return accessOtherTills;
    }

    public void setAccessOtherTills(Boolean accessOtherTills) {
        this.accessOtherTills = accessOtherTills;
    }

    public Boolean getAddCommentinJournal() {
        return addCommentinJournal;
    }

    public void setAddCommentinJournal(Boolean addCommentinJournal) {
        this.addCommentinJournal = addCommentinJournal;
    }

    public Boolean getAddCustomertoSale() {
        return addCustomertoSale;
    }

    public void setAddCustomertoSale(Boolean addCustomertoSale) {
        this.addCustomertoSale = addCustomertoSale;
    }

    public Boolean getAddDiscount() {
        return addDiscount;
    }

    public void setAddDiscount(Boolean addDiscount) {
        this.addDiscount = addDiscount;
    }

    public Boolean getAdministerOperatingSystemGrantscommandpromptaccess() {
        return administerOperatingSystemGrantscommandpromptaccess;
    }

    public void setAdministerOperatingSystemGrantscommandpromptaccess(Boolean administerOperatingSystemGrantscommandpromptaccess) {
        this.administerOperatingSystemGrantscommandpromptaccess = administerOperatingSystemGrantscommandpromptaccess;
    }

    public Boolean getMposDashboard() {
        return mposDashboard;
    }

    public void setMposDashboard(Boolean mposDashboard) {
        this.mposDashboard = mposDashboard;
    }

    public Boolean getAdministrativeWorkCode() {
        return administrativeWorkCode;
    }

    public void setAdministrativeWorkCode(Boolean administrativeWorkCode) {
        this.administrativeWorkCode = administrativeWorkCode;
    }

    public Boolean getAllowEmployeeSale() {
        return allowEmployeeSale;
    }

    public void setAllowEmployeeSale(Boolean allowEmployeeSale) {
        this.allowEmployeeSale = allowEmployeeSale;
    }

    public Boolean getAllowExpiredCouponOverride() {
        return allowExpiredCouponOverride;
    }

    public void setAllowExpiredCouponOverride(Boolean allowExpiredCouponOverride) {
        this.allowExpiredCouponOverride = allowExpiredCouponOverride;
    }

    public Boolean getAllowForeignChangeAboveAvailableFunds() {
        return allowForeignChangeAboveAvailableFunds;
    }

    public void setAllowForeignChangeAboveAvailableFunds(Boolean allowForeignChangeAboveAvailableFunds) {
        this.allowForeignChangeAboveAvailableFunds = allowForeignChangeAboveAvailableFunds;
    }

    public Boolean getAllowInactiveCouponOverride() {
        return allowInactiveCouponOverride;
    }

    public void setAllowInactiveCouponOverride(Boolean allowInactiveCouponOverride) {
        this.allowInactiveCouponOverride = allowInactiveCouponOverride;
    }

    public Boolean getAssociateAdvance() {
        return associateAdvance;
    }

    public void setAssociateAdvance(Boolean associateAdvance) {
        this.associateAdvance = associateAdvance;
    }

    public Boolean getAssociateMaintenance() {
        return associateMaintenance;
    }

    public void setAssociateMaintenance(Boolean associateMaintenance) {
        this.associateMaintenance = associateMaintenance;
    }

    public Boolean getAttachCashDrawerTill() {
        return attachCashDrawerTill;
    }

    public void setAttachCashDrawerTill(Boolean attachCashDrawerTill) {
        this.attachCashDrawerTill = attachCashDrawerTill;
    }

    public Boolean getAttachOtherTill() {
        return attachOtherTill;
    }

    public void setAttachOtherTill(Boolean attachOtherTill) {
        this.attachOtherTill = attachOtherTill;
    }

    public Boolean getAttachTill() {
        return attachTill;
    }

    public void setAttachTill(Boolean attachTill) {
        this.attachTill = attachTill;
    }

    public Boolean getBackofficeAccess() {
        return backofficeAccess;
    }

    public void setBackofficeAccess(Boolean backofficeAccess) {
        this.backofficeAccess = backofficeAccess;
    }

    public Boolean getBlindReturnsThresholdAmount() {
        return blindReturnsThresholdAmount;
    }

    public void setBlindReturnsThresholdAmount(Boolean blindReturnsThresholdAmount) {
        this.blindReturnsThresholdAmount = blindReturnsThresholdAmount;
    }

    public Boolean getCancelLayaway() {
        return cancelLayaway;
    }

    public void setCancelLayaway(Boolean cancelLayaway) {
        this.cancelLayaway = cancelLayaway;
    }

    public Boolean getCancelTransaction() {
        return cancelTransaction;
    }

    public void setCancelTransaction(Boolean cancelTransaction) {
        this.cancelTransaction = cancelTransaction;
    }

    public Boolean getCannotBeLockedOut() {
        return cannotBeLockedOut;
    }

    public void setCannotBeLockedOut(Boolean cannotBeLockedOut) {
        this.cannotBeLockedOut = cannotBeLockedOut;
    }

    public Boolean getCashChangeDueLimit() {
        return cashChangeDueLimit;
    }

    public void setCashChangeDueLimit(Boolean cashChangeDueLimit) {
        this.cashChangeDueLimit = cashChangeDueLimit;
    }

    public Boolean getCashPickup() {
        return cashPickup;
    }

    public void setCashPickup(Boolean cashPickup) {
        this.cashPickup = cashPickup;
    }

    public Boolean getCashTransfer() {
        return cashTransfer;
    }

    public void setCashTransfer(Boolean cashTransfer) {
        this.cashTransfer = cashTransfer;
    }

    public Boolean getChangeDiscount() {
        return changeDiscount;
    }

    public void setChangeDiscount(Boolean changeDiscount) {
        this.changeDiscount = changeDiscount;
    }

    public Boolean getChangePasswordofOtherUser() {
        return changePasswordofOtherUser;
    }

    public void setChangePasswordofOtherUser(Boolean changePasswordofOtherUser) {
        this.changePasswordofOtherUser = changePasswordofOtherUser;
    }

    public Boolean getChangePrice() {
        return changePrice;
    }

    public void setChangePrice(Boolean changePrice) {
        this.changePrice = changePrice;
    }

    public Boolean getChangePriceonVerifiedReturn() {
        return changePriceonVerifiedReturn;
    }

    public void setChangePriceonVerifiedReturn(Boolean changePriceonVerifiedReturn) {
        this.changePriceonVerifiedReturn = changePriceonVerifiedReturn;
    }

    public Boolean getChangeQuantity() {
        return changeQuantity;
    }

    public void setChangeQuantity(Boolean changeQuantity) {
        this.changeQuantity = changeQuantity;
    }

    public Boolean getChangeTillFloat() {
        return changeTillFloat;
    }

    public void setChangeTillFloat(Boolean changeTillFloat) {
        this.changeTillFloat = changeTillFloat;
    }

    public Boolean getCheckforUpdates() {
        return checkforUpdates;
    }

    public void setCheckforUpdates(Boolean checkforUpdates) {
        this.checkforUpdates = checkforUpdates;
    }

    public Boolean getCloseStorewithSuspendedSales() {
        return closeStorewithSuspendedSales;
    }

    public void setCloseStorewithSuspendedSales(Boolean closeStorewithSuspendedSales) {
        this.closeStorewithSuspendedSales = closeStorewithSuspendedSales;
    }

    public Boolean getCreateCustomer() {
        return createCustomer;
    }

    public void setCreateCustomer(Boolean createCustomer) {
        this.createCustomer = createCustomer;
    }

    public Boolean getCustomernotpresenttenderManagerOverride() {
        return customernotpresenttenderManagerOverride;
    }

    public void setCustomernotpresenttenderManagerOverride(Boolean customernotpresenttenderManagerOverride) {
        this.customernotpresenttenderManagerOverride = customernotpresenttenderManagerOverride;
    }

    public Boolean getEndCountOtherTill() {
        return endCountOtherTill;
    }

    public void setEndCountOtherTill(Boolean endCountOtherTill) {
        this.endCountOtherTill = endCountOtherTill;
    }

    public Boolean getExceedMaximumDiscount() {
        return exceedMaximumDiscount;
    }

    public void setExceedMaximumDiscount(Boolean exceedMaximumDiscount) {
        this.exceedMaximumDiscount = exceedMaximumDiscount;
    }

    public Boolean getForManulDiscount() {
        return forManulDiscount;
    }

    public void setForManulDiscount(Boolean forManulDiscount) {
        this.forManulDiscount = forManulDiscount;
    }

    public Boolean getForPriceOverride() {
        return forPriceOverride;
    }

    public void setForPriceOverride(Boolean forPriceOverride) {
        this.forPriceOverride = forPriceOverride;
    }

    public Boolean getForceCloseReplenishment() {
        return forceCloseReplenishment;
    }

    public void setForceCloseReplenishment(Boolean forceCloseReplenishment) {
        this.forceCloseReplenishment = forceCloseReplenishment;
    }

    public Boolean getForceRedemptionofCoupon() {
        return forceRedemptionofCoupon;
    }

    public void setForceRedemptionofCoupon(Boolean forceRedemptionofCoupon) {
        this.forceRedemptionofCoupon = forceRedemptionofCoupon;
    }

    public Boolean getIssueInvoiceFromEJ() {
        return issueInvoiceFromEJ;
    }

    public void setIssueInvoiceFromEJ(Boolean issueInvoiceFromEJ) {
        this.issueInvoiceFromEJ = issueInvoiceFromEJ;
    }

    public Boolean getIssueTill() {
        return issueTill;
    }

    public void setIssueTill(Boolean issueTill) {
        this.issueTill = issueTill;
    }

    public Boolean getKeepCashDrawerOpen() {
        return keepCashDrawerOpen;
    }

    public void setKeepCashDrawerOpen(Boolean keepCashDrawerOpen) {
        this.keepCashDrawerOpen = keepCashDrawerOpen;
    }

    public Boolean getLayawayItemPriceBelowMinimum() {
        return layawayItemPriceBelowMinimum;
    }

    public void setLayawayItemPriceBelowMinimum(Boolean layawayItemPriceBelowMinimum) {
        this.layawayItemPriceBelowMinimum = layawayItemPriceBelowMinimum;
    }

    public Boolean getLogin() {
        return login;
    }

    public void setLogin(Boolean login) {
        this.login = login;
    }

    public Boolean getLogintoSystem() {
        return logintoSystem;
    }

    public void setLogintoSystem(Boolean logintoSystem) {
        this.logintoSystem = logintoSystem;
    }

    public Boolean getLogintoXenvironment() {
        return logintoXenvironment;
    }

    public void setLogintoXenvironment(Boolean logintoXenvironment) {
        this.logintoXenvironment = logintoXenvironment;
    }

    public Boolean getMaintainCurrencyExchangeRates() {
        return maintainCurrencyExchangeRates;
    }

    public void setMaintainCurrencyExchangeRates(Boolean maintainCurrencyExchangeRates) {
        this.maintainCurrencyExchangeRates = maintainCurrencyExchangeRates;
    }

    public Boolean getManageNetworkedCashDrawers() {
        return manageNetworkedCashDrawers;
    }

    public void setManageNetworkedCashDrawers(Boolean manageNetworkedCashDrawers) {
        this.manageNetworkedCashDrawers = manageNetworkedCashDrawers;
    }

    public Boolean getManageTills() {
        return manageTills;
    }

    public void setManageTills(Boolean manageTills) {
        this.manageTills = manageTills;
    }

    public Boolean getManualOverrideforAccountReceivable() {
        return manualOverrideforAccountReceivable;
    }

    public void setManualOverrideforAccountReceivable(Boolean manualOverrideforAccountReceivable) {
        this.manualOverrideforAccountReceivable = manualOverrideforAccountReceivable;
    }

    public Boolean getManulEntryforPointRedeemption() {
        return manulEntryforPointRedeemption;
    }

    public void setManulEntryforPointRedeemption(Boolean manulEntryforPointRedeemption) {
        this.manulEntryforPointRedeemption = manulEntryforPointRedeemption;
    }

    public Boolean getMobileClientDeviceAccess() {
        return mobileClientDeviceAccess;
    }

    public void setMobileClientDeviceAccess(Boolean mobileClientDeviceAccess) {
        this.mobileClientDeviceAccess = mobileClientDeviceAccess;
    }

    public Boolean getNeedtocomefromtheTenderModetoItemMode() {
        return needtocomefromtheTenderModetoItemMode;
    }

    public void setNeedtocomefromtheTenderModetoItemMode(Boolean needtocomefromtheTenderModetoItemMode) {
        this.needtocomefromtheTenderModetoItemMode = needtocomefromtheTenderModetoItemMode;
    }

    public Boolean getNoSale() {
        return noSale;
    }

    public void setNoSale(Boolean noSale) {
        this.noSale = noSale;
    }

    public Boolean getOTPFailureaskedforManageroverride() {
        return oTPFailureaskedforManageroverride;
    }

    public void setOTPFailureaskedforManageroverride(Boolean oTPFailureaskedforManageroverride) {
        this.oTPFailureaskedforManageroverride = oTPFailureaskedforManageroverride;
    }

    public Boolean getOpenStoreBank() {
        return openStoreBank;
    }

    public void setOpenStoreBank(Boolean openStoreBank) {
        this.openStoreBank = openStoreBank;
    }

    public Boolean getOverrideBlindReturnPrice() {
        return overrideBlindReturnPrice;
    }

    public void setOverrideBlindReturnPrice(Boolean overrideBlindReturnPrice) {
        this.overrideBlindReturnPrice = overrideBlindReturnPrice;
    }

    public Boolean getOverrideCancelLayawaytoEscrow() {
        return overrideCancelLayawaytoEscrow;
    }

    public void setOverrideCancelLayawaytoEscrow(Boolean overrideCancelLayawaytoEscrow) {
        this.overrideCancelLayawaytoEscrow = overrideCancelLayawaytoEscrow;
    }

    public Boolean getOverrideCancelSpecialOrdertoEscrow() {
        return overrideCancelSpecialOrdertoEscrow;
    }

    public void setOverrideCancelSpecialOrdertoEscrow(Boolean overrideCancelSpecialOrdertoEscrow) {
        this.overrideCancelSpecialOrdertoEscrow = overrideCancelSpecialOrdertoEscrow;
    }

    public Boolean getOverrideLayawayDeposit() {
        return overrideLayawayDeposit;
    }

    public void setOverrideLayawayDeposit(Boolean overrideLayawayDeposit) {
        this.overrideLayawayDeposit = overrideLayawayDeposit;
    }

    public Boolean getOverrideMaximumEnteredReceivingQuantity() {
        return overrideMaximumEnteredReceivingQuantity;
    }

    public void setOverrideMaximumEnteredReceivingQuantity(Boolean overrideMaximumEnteredReceivingQuantity) {
        this.overrideMaximumEnteredReceivingQuantity = overrideMaximumEnteredReceivingQuantity;
    }

    public Boolean getOverrideOnHoldDepositAmount() {
        return overrideOnHoldDepositAmount;
    }

    public void setOverrideOnHoldDepositAmount(Boolean overrideOnHoldDepositAmount) {
        this.overrideOnHoldDepositAmount = overrideOnHoldDepositAmount;
    }

    public Boolean getOverrideforEnteringFlightInformation() {
        return overrideforEnteringFlightInformation;
    }

    public void setOverrideforEnteringFlightInformation(Boolean overrideforEnteringFlightInformation) {
        this.overrideforEnteringFlightInformation = overrideforEnteringFlightInformation;
    }

    public Boolean getOvertenderAboveMaximum() {
        return overtenderAboveMaximum;
    }

    public void setOvertenderAboveMaximum(Boolean overtenderAboveMaximum) {
        this.overtenderAboveMaximum = overtenderAboveMaximum;
    }

    public Boolean getPerformtheEndOfDayprocess() {
        return performtheEndOfDayprocess;
    }

    public void setPerformtheEndOfDayprocess(Boolean performtheEndOfDayprocess) {
        this.performtheEndOfDayprocess = performtheEndOfDayprocess;
    }

    public Boolean getPostVoidTransactioninBackOffice() {
        return postVoidTransactioninBackOffice;
    }

    public void setPostVoidTransactioninBackOffice(Boolean postVoidTransactioninBackOffice) {
        this.postVoidTransactioninBackOffice = postVoidTransactioninBackOffice;
    }

    public Boolean getPostVoidTransactioninRegister() {
        return postVoidTransactioninRegister;
    }

    public void setPostVoidTransactioninRegister(Boolean postVoidTransactioninRegister) {
        this.postVoidTransactioninRegister = postVoidTransactioninRegister;
    }

    public Boolean getPostVoidanInvoiceFromEJ() {
        return postVoidanInvoiceFromEJ;
    }

    public void setPostVoidanInvoiceFromEJ(Boolean postVoidanInvoiceFromEJ) {
        this.postVoidanInvoiceFromEJ = postVoidanInvoiceFromEJ;
    }

    public Boolean getPostVoidfromJournal() {
        return postVoidfromJournal;
    }

    public void setPostVoidfromJournal(Boolean postVoidfromJournal) {
        this.postVoidfromJournal = postVoidfromJournal;
    }

    public Boolean getPostVoidshouldbedoneinPOS() {
        return postVoidshouldbedoneinPOS;
    }

    public void setPostVoidshouldbedoneinPOS(Boolean postVoidshouldbedoneinPOS) {
        this.postVoidshouldbedoneinPOS = postVoidshouldbedoneinPOS;
    }

    public Boolean getPrintCustomerDetails() {
        return printCustomerDetails;
    }

    public void setPrintCustomerDetails(Boolean printCustomerDetails) {
        this.printCustomerDetails = printCustomerDetails;
    }

    public Boolean getReconcileStoreBank() {
        return reconcileStoreBank;
    }

    public void setReconcileStoreBank(Boolean reconcileStoreBank) {
        this.reconcileStoreBank = reconcileStoreBank;
    }

    public Boolean getReconcileTill() {
        return reconcileTill;
    }

    public void setReconcileTill(Boolean reconcileTill) {
        this.reconcileTill = reconcileTill;
    }

    public Boolean getReconciletillsessionincashdraweraccountability() {
        return reconciletillsessionincashdraweraccountability;
    }

    public void setReconciletillsessionincashdraweraccountability(Boolean reconciletillsessionincashdraweraccountability) {
        this.reconciletillsessionincashdraweraccountability = reconciletillsessionincashdraweraccountability;
    }

    public Boolean getReconciletillsessioninregisteraccountability() {
        return reconciletillsessioninregisteraccountability;
    }

    public void setReconciletillsessioninregisteraccountability(Boolean reconciletillsessioninregisteraccountability) {
        this.reconciletillsessioninregisteraccountability = reconciletillsessioninregisteraccountability;
    }

    public Boolean getRefundMoreCashThanAvailable() {
        return refundMoreCashThanAvailable;
    }

    public void setRefundMoreCashThanAvailable(Boolean refundMoreCashThanAvailable) {
        this.refundMoreCashThanAvailable = refundMoreCashThanAvailable;
    }

    public Boolean getRefundTenderBalance() {
        return refundTenderBalance;
    }

    public void setRefundTenderBalance(Boolean refundTenderBalance) {
        this.refundTenderBalance = refundTenderBalance;
    }

    public Boolean getReloadGiftCard() {
        return reloadGiftCard;
    }

    public void setReloadGiftCard(Boolean reloadGiftCard) {
        this.reloadGiftCard = reloadGiftCard;
    }

    public Boolean getRemoveCashDrawerTill() {
        return removeCashDrawerTill;
    }

    public void setRemoveCashDrawerTill(Boolean removeCashDrawerTill) {
        this.removeCashDrawerTill = removeCashDrawerTill;
    }

    public Boolean getRemoveOtherTill() {
        return removeOtherTill;
    }

    public void setRemoveOtherTill(Boolean removeOtherTill) {
        this.removeOtherTill = removeOtherTill;
    }

    public Boolean getRemoveOwnTill() {
        return removeOwnTill;
    }

    public void setRemoveOwnTill(Boolean removeOwnTill) {
        this.removeOwnTill = removeOwnTill;
    }

    public Boolean getReprintInvoiceFromEJ() {
        return reprintInvoiceFromEJ;
    }

    public void setReprintInvoiceFromEJ(Boolean reprintInvoiceFromEJ) {
        this.reprintInvoiceFromEJ = reprintInvoiceFromEJ;
    }

    public Boolean getReprintLastInvoice() {
        return reprintLastInvoice;
    }

    public void setReprintLastInvoice(Boolean reprintLastInvoice) {
        this.reprintLastInvoice = reprintLastInvoice;
    }

    public Boolean getReprintReceiptfromJournal() {
        return reprintReceiptfromJournal;
    }

    public void setReprintReceiptfromJournal(Boolean reprintReceiptfromJournal) {
        this.reprintReceiptfromJournal = reprintReceiptfromJournal;
    }

    public Boolean getReprintReceiptfromPreviousDay() {
        return reprintReceiptfromPreviousDay;
    }

    public void setReprintReceiptfromPreviousDay(Boolean reprintReceiptfromPreviousDay) {
        this.reprintReceiptfromPreviousDay = reprintReceiptfromPreviousDay;
    }

    public Boolean getReturnGiftCard() {
        return returnGiftCard;
    }

    public void setReturnGiftCard(Boolean returnGiftCard) {
        this.returnGiftCard = returnGiftCard;
    }

    public Boolean getReturnItem() {
        return returnItem;
    }

    public void setReturnItem(Boolean returnItem) {
        this.returnItem = returnItem;
    }

    public Boolean getReturnItemNotinOriginalSale() {
        return returnItemNotinOriginalSale;
    }

    public void setReturnItemNotinOriginalSale(Boolean returnItemNotinOriginalSale) {
        this.returnItemNotinOriginalSale = returnItemNotinOriginalSale;
    }

    public Boolean getReturnItemOverMaximumPrice() {
        return returnItemOverMaximumPrice;
    }

    public void setReturnItemOverMaximumPrice(Boolean returnItemOverMaximumPrice) {
        this.returnItemOverMaximumPrice = returnItemOverMaximumPrice;
    }

    public Boolean getReturnItemUnderMinimumPrice() {
        return returnItemUnderMinimumPrice;
    }

    public void setReturnItemUnderMinimumPrice(Boolean returnItemUnderMinimumPrice) {
        this.returnItemUnderMinimumPrice = returnItemUnderMinimumPrice;
    }

    public Boolean getReturnMoreThanQuantityPurchased() {
        return returnMoreThanQuantityPurchased;
    }

    public void setReturnMoreThanQuantityPurchased(Boolean returnMoreThanQuantityPurchased) {
        this.returnMoreThanQuantityPurchased = returnMoreThanQuantityPurchased;
    }

    public Boolean getReturnNonMerchandiseItem() {
        return returnNonMerchandiseItem;
    }

    public void setReturnNonMerchandiseItem(Boolean returnNonMerchandiseItem) {
        this.returnNonMerchandiseItem = returnNonMerchandiseItem;
    }

    public Boolean getReturnTill() {
        return returnTill;
    }

    public void setReturnTill(Boolean returnTill) {
        this.returnTill = returnTill;
    }

    public Boolean getReturnUnreturnableItem() {
        return returnUnreturnableItem;
    }

    public void setReturnUnreturnableItem(Boolean returnUnreturnableItem) {
        this.returnUnreturnableItem = returnUnreturnableItem;
    }

    public Boolean getReturnUnreturnableItemAfterMaxDays() {
        return returnUnreturnableItemAfterMaxDays;
    }

    public void setReturnUnreturnableItemAfterMaxDays(Boolean returnUnreturnableItemAfterMaxDays) {
        this.returnUnreturnableItemAfterMaxDays = returnUnreturnableItemAfterMaxDays;
    }

    public Boolean getSellGiftCard() {
        return sellGiftCard;
    }

    public void setSellGiftCard(Boolean sellGiftCard) {
        this.sellGiftCard = sellGiftCard;
    }

    public Boolean getSellGiftCertificate() {
        return sellGiftCertificate;
    }

    public void setSellGiftCertificate(Boolean sellGiftCertificate) {
        this.sellGiftCertificate = sellGiftCertificate;
    }

    public Boolean getSellItem() {
        return sellItem;
    }

    public void setSellItem(Boolean sellItem) {
        this.sellItem = sellItem;
    }

    public Boolean getSellItemNotonFile() {
        return sellItemNotonFile;
    }

    public void setSellItemNotonFile(Boolean sellItemNotonFile) {
        this.sellItemNotonFile = sellItemNotonFile;
    }

    public Boolean getSellNonMerchandiseItem() {
        return sellNonMerchandiseItem;
    }

    public void setSellNonMerchandiseItem(Boolean sellNonMerchandiseItem) {
        this.sellNonMerchandiseItem = sellNonMerchandiseItem;
    }

    public Boolean getStartofDayEndofDay() {
        return startofDayEndofDay;
    }

    public void setStartofDayEndofDay(Boolean startofDayEndofDay) {
        this.startofDayEndofDay = startofDayEndofDay;
    }

    public Boolean getStockfilegeneration() {
        return stockfilegeneration;
    }

    public void setStockfilegeneration(Boolean stockfilegeneration) {
        this.stockfilegeneration = stockfilegeneration;
    }

    public Boolean getStoreBankCashDeposit() {
        return storeBankCashDeposit;
    }

    public void setStoreBankCashDeposit(Boolean storeBankCashDeposit) {
        this.storeBankCashDeposit = storeBankCashDeposit;
    }

    public Boolean getSuspendTransaction() {
        return suspendTransaction;
    }

    public void setSuspendTransaction(Boolean suspendTransaction) {
        this.suspendTransaction = suspendTransaction;
    }

    public Boolean getTILLOption() {
        return tILLOption;
    }

    public void setTILLOption(Boolean tILLOption) {
        this.tILLOption = tILLOption;
    }

    public Boolean getTenderAboveAllowedAmount() {
        return tenderAboveAllowedAmount;
    }

    public void setTenderAboveAllowedAmount(Boolean tenderAboveAllowedAmount) {
        this.tenderAboveAllowedAmount = tenderAboveAllowedAmount;
    }

    public Boolean getTransactionManualDiscountLimit() {
        return transactionManualDiscountLimit;
    }

    public void setTransactionManualDiscountLimit(Boolean transactionManualDiscountLimit) {
        this.transactionManualDiscountLimit = transactionManualDiscountLimit;
    }

    public Boolean getUnlockRegister() {
        return unlockRegister;
    }

    public void setUnlockRegister(Boolean unlockRegister) {
        this.unlockRegister = unlockRegister;
    }

    public Boolean getViewCustomerDetails() {
        return viewCustomerDetails;
    }

    public void setViewCustomerDetails(Boolean viewCustomerDetails) {
        this.viewCustomerDetails = viewCustomerDetails;
    }

    public Boolean getVoidLineItem() {
        return voidLineItem;
    }

    public void setVoidLineItem(Boolean voidLineItem) {
        this.voidLineItem = voidLineItem;
    }

    public Boolean getVoidTender() {
        return voidTender;
    }

    public void setVoidTender(Boolean voidTender) {
        this.voidTender = voidTender;
    }

    public Boolean getXfgShowcodefunctions() {
        return xfgShowcodefunctions;
    }

    public void setXfgShowcodefunctions(Boolean xfgShowcodefunctions) {
        this.xfgShowcodefunctions = xfgShowcodefunctions;
    }

    public Boolean getXfgVoidthelastitemsold() {
        return xfgVoidthelastitemsold;
    }

    public void setXfgVoidthelastitemsold(Boolean xfgVoidthelastitemsold) {
        this.xfgVoidthelastitemsold = xfgVoidthelastitemsold;
    }

}




















