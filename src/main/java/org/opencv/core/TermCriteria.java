package org.opencv.core;

public class TermCriteria {

    public static final int COUNT = 1;
    public static final int MAX_ITER = COUNT;
    public static final int EPS = 2;

    int type;
    int maxCount;
    double epsilon;

    public TermCriteria(int type, int maxCount) {
        this.type = type;
        this.maxCount = maxCount;
        this.epsilon = EPS;
    }

    public TermCriteria(int type, int maxCount, double epsilon) {
        this.type = type;
        this.maxCount = maxCount;
        this.epsilon = epsilon;
    }
}
