package com.wangdaye.mysplash._common.i.model;

import com.wangdaye.mysplash._common.data.service.CollectionService;
import com.wangdaye.mysplash._common.ui.adapter.CollectionAdapter;

/**
 * Collections model.
 * */

public interface CollectionsModel {

    CollectionAdapter getAdapter();
    CollectionService getService();

    Object getRequestKey();
    void setRequestKey(Object key);

    String getCollectionsType();
    void setCollectionsType(String type);

    int getCollectionsPage();
    void setCollectionsPage(int page);

    boolean isRefreshing();
    void setRefreshing(boolean refreshing);

    boolean isLoading();
    void setLoading(boolean loading);

    boolean isOver();
    void setOver(boolean over);
}
