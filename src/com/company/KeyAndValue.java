package com.company;

public class KeyAndValue implements Connection{
    private String readAndWriteKey;
    private String readAndWritValue;
    private boolean connection;

    public boolean isConnection() {
        return connection;
    }

    public void setConnection(boolean connection) {
        this.connection = connection;
    }

    public String getReadAndWriteKey() {
        return readAndWriteKey;
    }

    public void setReadAndWriteKey(String readAndWriteKey) {
        this.readAndWriteKey = readAndWriteKey;
    }

    public String getReadAndWritValue() {
        return readAndWritValue;
    }

    public void setReadAndWritValue(String readAndWritValue) {
        this.readAndWritValue = readAndWritValue;
    }

    @Override
    public void openADatabaseConnection() {
        connection = true;
    }

    @Override
    public void closeTheDatabaseConnection() {
        connection = false;
    }

    @Override
    public boolean checkIfThereIsAConnectionToTheBase() {
        return connection;
    }

    @Override
    public void readOneRecordByIndex(KeyAndValue[] keyAndValues, int index) {
        try {
            System.out.println(keyAndValues[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

    @Override
    public void checkIfThereIsAnEntryForSuchAndSuchAKey(KeyAndValue[] keyAndValues, int key) {
        int p = 0;
        for (int i = 0; i < keyAndValues.length; i++) {
            if (keyAndValues[i].getReadAndWriteKey().equals(key)){
                System.out.println("Есть такой запись");
            }
            if (p > 0){
                System.out.println("Нет такой записи");
            }
        }
    }

    @Override
    public void readOneRecordByKey(KeyAndValue[] keyAndValues, int key) {
        boolean a = false;
        try {
            for (KeyAndValue k: keyAndValues) {
                if (getReadAndWriteKey().equals(getReadAndWriteKey())){
                    System.out.println(getReadAndWriteKey());
                    System.out.println("Ключ найден");
                    a = true;
                }
                if (a){
                    throw new Exception();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void readACertainSetOfRecordsFromTheDatabase(KeyAndValue[] keyAndValues, int index, int i) {
        for (int j = index; j < i; j++) {
            System.out.println(keyAndValues[i]);
        }
    }

    @Override
    public void findOutTheNumberOfRecordsInTheDatabase(KeyAndValue[] keyAndValues) {
        System.out.println(keyAndValues.length);
    }

    @Override
    public void addRecordToBase(KeyAndValue[] keyAndValues, String readAndWritValue, String readAndWriteKey) {
        KeyAndValue[] key1 = new KeyAndValue[keyAndValues.length +1];
        KeyAndValue key2 = new KeyAndValue();
        key2.setReadAndWriteKey(readAndWriteKey);
        key2.setReadAndWritValue(readAndWritValue);
        key1[key1.length - 1] = key2;
        key1[key1.length - 1] = key2;
    }

    @Override
    public void updateRecordValueByIndex(KeyAndValue[] keyAndValues, int index, String value) {
        keyAndValues[index].setReadAndWritValue(value);
    }

    @Override
    public void updateRecordContentByKey(KeyAndValue[] keyAndValues, String key, String value) {
        for (KeyAndValue k: keyAndValues) {
            if (k.getReadAndWriteKey().equals(value)){
                k.setReadAndWritValue(key);
            }
        }
    }
}
