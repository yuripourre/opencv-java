package org.opencv.core;

import com.badlogic.gdx.math.Matrix3;

public class InputArray {
    protected Mat matrix;

    public InputArray(Matrix3 matrix) {
        this.matrix = new Mat(matrix);
    }

    public InputArray(Mat matrix) {
        this.matrix = matrix;
    }

    public Mat getMat() {
        return matrix;
    }
}
