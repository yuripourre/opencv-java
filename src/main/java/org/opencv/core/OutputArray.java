package org.opencv.core;

import com.badlogic.gdx.math.Matrix3;

public class OutputArray extends InputArray {

    public OutputArray(Matrix3 matrix) {
        super(matrix);
    }

    public OutputArray(Mat matrix) {
        super(matrix);
    }
}
