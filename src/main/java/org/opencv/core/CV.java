package org.opencv.core;

public class CV {

    public static final int CV_32F = 1;

    // Code from  opencv/modules/imgproc/src/undistort.cpp
    // https://github.com/opencv/opencv/blob/master/modules/imgproc/src/undistort.cpp
    public static void undistortPoints(InputArray _src, OutputArray _dst,
                                       InputArray _cameraMatrix,
                                       InputArray _distCoeffs,
                                       InputArray _Rmat,
                                       InputArray _Pmat)
    {
        undistortPoints(_src, _dst, _cameraMatrix, _distCoeffs, _Rmat, _Pmat, new TermCriteria(TermCriteria.MAX_ITER, 5, 0.01));
    }

    private static void undistortPoints(InputArray src, OutputArray dst, InputArray cameraMatrix, InputArray distCoeffs, InputArray rmat, InputArray pmat, TermCriteria termCriteria) {

    }

}
