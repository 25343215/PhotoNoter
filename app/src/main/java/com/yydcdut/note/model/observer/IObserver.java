package com.yydcdut.note.model.observer;

/**
 * Created by yuyidong on 15/10/16.
 */
public interface IObserver {
    int OBSERVER_PHOTONOTE_CREATE = 0;
    int OBSERVER_PHOTONOTE_RETRIEVE = 1;
    int OBSERVER_PHOTONOTE_UPDATE = 2;
    int OBSERVER_PHOTONOTE_DELETE = 3;

    int OBSERVER_CATEGORY_CREATE = 100;
    int OBSERVER_CATEGORY_RETRIEVE = 101;
    int OBSERVER_CATEGORY_UPDATE = 102;
    int OBSERVER_CATEGORY_DELETE = 103;
    int OBSERVER_CATEGORY_MOVE = 104;

}