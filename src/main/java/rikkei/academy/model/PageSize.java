package rikkei.academy.model;

public class PageSize {
    private int id;
    private long size;

    public PageSize() {
    }

    public PageSize(int id, long size) {
        this.id = id;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
