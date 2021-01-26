package com.company;

public interface Connection {
    void openADatabaseConnection();
    void closeTheDatabaseConnection();
    boolean checkIfThereIsAConnectionToTheBase();
    void readOneRecordByIndex(KeyAndValue[] keyAndValues, int index);
    void checkIfThereIsAnEntryForSuchAndSuchAKey(KeyAndValue[] keyAndValues, int key);
    void readOneRecordByKey(KeyAndValue[] keyAndValues, int key);
    void readACertainSetOfRecordsFromTheDatabase(KeyAndValue[] keyAndValues, int index, int i);
    void findOutTheNumberOfRecordsInTheDatabase(KeyAndValue[] keyAndValues);
    void addRecordToBase(KeyAndValue[] keyAndValues, String readAndWritValue, String readAndWriteKey);
    void updateRecordValueByIndex(KeyAndValue[] keyAndValues, int index, String value);
    void updateRecordContentByKey(KeyAndValue[] keyAndValues, String key, String value);
}
