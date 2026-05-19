//part A
public Account(String requestedName) {
    username = requestedName;
    int j = 1;

    while (!Account.isAvailable(username)) {
        username = requestedName + j;
        j++;
    }
}

//Part B
public String getShortenedName() {
    String ret = username;

    while (ret.indexOf("-") > -1) {
        int index = ret.indexOf("-");
        ret = ret.substring(0, index - 1) + ret.substring(index + 1);
    }

    return ret;
}
