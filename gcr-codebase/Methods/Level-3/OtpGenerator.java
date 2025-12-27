class OtpGenerator {

    // Method to generate a 6-digit OTP
    public static int generateSixDigitOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    //check if all OTPs are unique
    public static boolean areOTPUnique(int[] otps) {

        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int totalOTPs = 10;
        int[] otpArray = new int[totalOTPs];

        // Generate OTPs
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateSixDigitOTP();
            System.out.println("OTP : " + otpArray[i]);
        }

        // Check uniqueness
        if (areOTPUnique(otpArray)) {
            System.out.println("All OTPs are unique");
        } else {
            System.out.println("same OTP found");
        }
    }
}