package com.example.presentsapp;

public class GiftReceiver {
    private String GiftReceiverName;
    private int NumberOfGifts;
    private double  BudgetAssigned;


    public GiftReceiver(String giftReceiverName, int numberOfGifts, double budgetAssigned) {
        GiftReceiverName = giftReceiverName;
        NumberOfGifts = numberOfGifts;
        BudgetAssigned = budgetAssigned;
    }

    public String getGiftReceiverName() {
        return GiftReceiverName;
    }

    public int getNumberOfGifts() {
        return NumberOfGifts;
    }

    public double getBudgetAssigned() {
        return BudgetAssigned;
    }
}
