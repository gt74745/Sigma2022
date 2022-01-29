package org.firstinspires.ftc.teamcode.autonomous.actions;

import org.firstinspires.ftc.teamcode.autonomous.hardware.Hardware;
import org.firstinspires.ftc.teamcode.autonomous.localization.Localization;

public class OpenClawAction extends Action{
    public OpenClawAction(int index, int priority) {super(index, priority);}

    public void execute(Hardware hardware, Localization localization)
    {
        long initialTime = System.currentTimeMillis();
        hardware.clawMotor.setPower(-0.2);
        while(System.currentTimeMillis() - initialTime < 100) {}
    }
}