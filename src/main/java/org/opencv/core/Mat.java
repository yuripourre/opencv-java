package org.opencv.core;

import com.badlogic.gdx.math.Matrix3;

/**
 * https://github.com/opencv/opencv/blob/master/modules/core/include/opencv2/core/mat.hpp
 */
public class Mat {

    public static final int ERROR = -1;

    int depth = CvType.CV_32F;

    protected Matrix3 matrix;

    public Mat() {
        this.matrix = new Matrix3();
    }

    public Mat(Matrix3 matrix) {
        this.matrix = matrix;
    }

    public int depth() {
        return depth;
    }

    public int checkVector(int elemChannels) {
        return checkVector(elemChannels, -1, true);
    }

    public int checkVector(int elemChannels, int depth, boolean requireContinuous) {
        if (depth != -1 && this.depth != depth) {
            return ERROR;
        }
        // Is that correct?
        return 9 / elemChannels;
    }

    public double checkVector(int elemChannels, int depth) {
        return checkVector(elemChannels, depth);
    }
}
