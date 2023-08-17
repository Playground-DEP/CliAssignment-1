import java.util.Scanner;

public class CliAssignment1 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        final String CLEAR = "\033[H\033[2J";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_GREEN_BOLD = "\033[33;1m";
        final String RESET = "\033[0m";

        final String DASHBOARD = "👷 Welcome To Smart Banking System";
        final String ADD_ACCOUNT = "➕ Add New Account";
        final String DEPOSIT = "➕ Deposit";
        final String WITHDRAW = "➕ Withdraw";
        final String TRANSFER = "➕ Transfer";
        final String PRINT_BALANCE = "🖨 Print Balance";
        final String DELETE_ACCOUNT = "❌ Remove Exisiting Account";

        final String ERROR_MSG = String.format("\t%s%s%s\n", COLOR_RED_BOLD, "%s", RESET);
        final String SUCCESS_MSG = String.format("\t%s%s%s\n", COLOR_GREEN_BOLD, "%s", RESET);

        String[] account = new String[0];
        int[] ID = new int[0];
        int[] DEPO = new int[0];
        String screen = DASHBOARD;

        do{
            final String APP_TITLE = String.format("%s%s%s",COLOR_BLUE_BOLD, screen, RESET);
            System.out.printf("\t%s\t\n", APP_TITLE);

            
        }while(true);
    }
}