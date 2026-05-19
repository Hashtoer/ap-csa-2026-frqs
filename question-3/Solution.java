public int moreHistoryThanMathAbsences() {
    String name;
    int count = 0;

    for (int i = 0; i < historyList.size(); i++) {
        name = historyList.get(i).getStudentID();

        for (int g = 0; g < mathList.size(); g++) {
            if (mathList.get(g).getStudentID().equals(name)) {
                if (historyList.get(i).getAbsences() > mathList.get(g).getAbsences()) {
                    count++;
                }
            }
        }
    }

    return count;
}
