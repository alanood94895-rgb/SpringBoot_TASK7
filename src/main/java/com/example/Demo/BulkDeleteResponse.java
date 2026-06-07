package com.example.Demo;

import java.util.List;

public class BulkDeleteResponse {
    private int totalRequested;
    private int deletedCount;
    private List<Integer> deletedIds;
    private List<Integer> notFoundIds;

    public BulkDeleteResponse(int totalRequested,
                              int deletedCount,
                              List<Integer> deletedIds,
                              List<Integer> notFoundIds) {

        this.totalRequested = totalRequested;
        this.deletedCount = deletedCount;
        this.deletedIds = deletedIds;
        this.notFoundIds = notFoundIds;
    }

    public int getTotalRequested() {
        return totalRequested;
    }

    public int getDeletedCount() {
        return deletedCount;
    }

    public List<Integer> getDeletedIds() {
        return deletedIds;
    }

    public List<Integer> getNotFoundIds() {
        return notFoundIds;
    }

}
