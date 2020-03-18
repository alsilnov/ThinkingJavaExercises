class Tank {
    private boolean empty;
    public void toEmpty() {
        empty = true;
    }
    @Override
    protected void finalize() throws Throwable {
        if (!empty) {
            System.out.println("not empty");
        }
    }
    public static void main(String[] args) {
        Tank test = new Tank();
        test = null;
        new Tank();
        System.gc();
    }
}
    
