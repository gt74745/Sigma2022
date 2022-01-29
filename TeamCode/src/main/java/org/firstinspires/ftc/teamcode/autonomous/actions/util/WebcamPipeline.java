package org.firstinspires.ftc.teamcode.autonomous.actions.util;

import org.firstinspires.ftc.teamcode.autonomous.AutonCore;
import org.opencv.core.Mat;
import org.openftc.easyopencv.OpenCvPipeline;

public class WebcamPipeline extends OpenCvPipeline {

    private Mat lastMat;

    @Override
    public Mat processFrame(Mat input) {
        lastMat = input;
        AutonCore.telem.addLine("Webcam ready");
        AutonCore.telem.update();
        System.out.println("new frame just dropped 0.0");
        return input;
    }

    public Mat getLastMat() {
        return lastMat;
    }

}
