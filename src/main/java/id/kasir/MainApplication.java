package banksampah;

import banksampah.Core.UserManagement;

class MainApplication {

    public static void main(String[] args) {
        System.out.println("bismillah");

        UserManagement user = new UserManagement();
        user.connectToCustomer();
    }
}