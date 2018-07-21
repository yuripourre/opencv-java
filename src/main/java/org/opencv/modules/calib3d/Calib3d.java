package org.opencv.modules.calib3d;

import org.opencv.core.CV;
import org.opencv.core.InputArray;
import org.opencv.core.Mat;
import org.opencv.core.OutputArray;

/**
 * Constant values found at: https://docs.opencv.org/java/3.1.0/constant-values.html
 */
public class Calib3d {
    public static final int CALIB_CB_ADAPTIVE_THRESH = 1;
    public static final int CALIB_CB_ASYMMETRIC_GRID = 2;
    public static final int CALIB_CB_CLUSTERING = 4;
    public static final int CALIB_CB_FAST_CHECK = 8;
    public static final int CALIB_CB_FILTER_QUADS = 4;
    public static final int CALIB_CB_NORMALIZE_IMAGE = 2;
    public static final int CALIB_CB_SYMMETRIC_GRID = 1;
    public static final int CALIB_CHECK_COND = 4;
    public static final int CALIB_FIX_ASPECT_RATIO = 2;
    public static final int CALIB_FIX_FOCAL_LENGTH = 16;
    public static final int CALIB_FIX_INTRINSIC = 256;
    public static final int CALIB_FIX_K1 = 16;
    public static final int CALIB_FIX_K2 = 32;
    public static final int CALIB_FIX_K3 = 64;
    public static final int CALIB_FIX_K4 = 128;
    public static final int CALIB_FIX_K5 = 4096;
    public static final int CALIB_FIX_K6 = 8192;
    public static final int CALIB_FIX_PRINCIPAL_POINT = 4;
    public static final int CALIB_FIX_S1_S2_S3_S4 = 65536;
    public static final int CALIB_FIX_SKEW = 8;
    public static final int CALIB_FIX_TAUX_TAUY = 524288;
    public static final int CALIB_RATIONAL_MODEL = 16384;
    public static final int CALIB_RECOMPUTE_EXTRINSIC = 2;
    public static final int CALIB_SAME_FOCAL_LENGTH = 512;
    public static final int CALIB_THIN_PRISM_MODEL = 32768;
    public static final int CALIB_TILTED_MODEL = 262144;
    public static final int CALIB_USE_INTRINSIC_GUESS = 1;
    public static final int CALIB_USE_LU = 131072;
    public static final int CALIB_ZERO_DISPARITY = 1024;
    public static final int CALIB_ZERO_TANGENT_DIST = 8;
    public static final int CV_DLS = 3;
    public static final int CV_EPNP = 1;
    public static final int CV_ITERATIVE = 0;
    public static final int CV_P3P = 2;
    public static final int FM_7POINT = 1;
    public static final int FM_8POINT = 2;
    public static final int FM_LMEDS = 4;
    public static final int FM_RANSAC = 8;
    public static final int LMEDS = 4;
    public static final int RANSAC = 8;
    public static final int RHO = 16;
    public static final int SOLVEPNP_DLS = 3;
    public static final int SOLVEPNP_EPNP = 1;
    public static final int SOLVEPNP_ITERATIVE = 0;
    public static final int SOLVEPNP_P3P = 2;
    public static final int SOLVEPNP_UPNP = 4;

    public static void undistortPoints(Mat ipoints, Mat undistortedPoints, Mat cameraMatrix, Mat distCoeffs) {
        CV.undistortPoints(new InputArray(ipoints), new OutputArray(undistortedPoints), new InputArray(cameraMatrix), new InputArray(distCoeffs), null, null);
    }
}
