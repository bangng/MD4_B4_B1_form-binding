package rikkei.academy.service.pagesizeservice;

import rikkei.academy.model.PageSize;

import java.util.ArrayList;
import java.util.List;

public class PageSizeServiceIMPL implements IPageSizeService{
public static List<PageSize> pageSizeList = new ArrayList<>();
static {
    pageSizeList.add(new PageSize(1,5));
    pageSizeList.add(new PageSize(2,10));
    pageSizeList.add(new PageSize(3,15));
    pageSizeList.add(new PageSize(4,25));
    pageSizeList.add(new PageSize(5,50));
    pageSizeList.add(new PageSize(6,100));
}
    @Override
    public List<PageSize> findAll() {
        return pageSizeList;
    }

    @Override
    public void save(PageSize pageSize) {

    }
}
