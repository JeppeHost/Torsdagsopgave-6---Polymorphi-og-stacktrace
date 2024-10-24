public class Cinema {

    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < seats; j++){
                this.seats[i][j] = "O";
            }
        }
        this.seats[0][0] = "X";
    }

    public int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {
        int rowIndex = row -1;
        int seatIndex = seat -1;
        if (seats[rowIndex][seatIndex].equals("O")) {
            seats[rowIndex][seatIndex] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        int rowIndex = row -1;
        int seatIndex = seat -1;
        if (seats[rowIndex][seatIndex].equals("X")) {
            seats[rowIndex][seatIndex] = "O";
            return true;
        }
        return false;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}
