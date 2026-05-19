public int getPointsForRow(int targetRow) {
    int sum = 0;
    boolean sameColor = true;
    String color = board[targetRow][0].getColor();

    for (int i = 0; i < board[0].length; i++) {
        sum += board[targetRow][i].getPoints();

        if (!(board[targetRow][i].getColor().equals(color))) {
            sameColor = false;
        }
    }

    if (sameColor) {
        return sum * 2;
    }

    return sum;
}
