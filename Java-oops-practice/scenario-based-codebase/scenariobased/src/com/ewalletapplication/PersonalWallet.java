package com.ewalletapplication;

class PersonalWallet extends Wallet {

    private static final double TRANSFER_LIMIT = 20000;

    public PersonalWallet(double balance) {
        super(balance);
    }

    public PersonalWallet(double balance, double referralBonus) {
        super(balance, referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (amount > TRANSFER_LIMIT) {
            System.out.println("Transfer limit exceeded (Personal Wallet)");
            return;
        }

        if (deductBalance(amount)) {
            receiver.getWallet().addBalance(amount);
            transactions.add(new Transaction("Transferred to " + receiver.getName(), -amount));
            receiver.getWallet().transactions.add(
                    new Transaction("Received from transfer", amount));
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

