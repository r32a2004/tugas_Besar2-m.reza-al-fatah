package com.example.uas_muhammadrezaalfatah.database;

public interface QueryResponse<T> {
    void onSuccess(T data);
    void onFailure(String message);
}