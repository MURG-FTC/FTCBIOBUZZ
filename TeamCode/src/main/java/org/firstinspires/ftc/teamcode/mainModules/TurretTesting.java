package org.firstinspires.ftc.teamcode.mainModules;

import com.qualcomm.robotcore.hardware.DcMotor;

import com.qualcomm.robotcore.hardware.HardwareMap;
public class TurretTesting {

    private DcMotor motor4;
    private DcMotor motor5;

    public TurretTesting(HardwareMap hardwareMap) {
        motor4 = hardwareMap.get(DcMotor.class, "Motor_4_CH");

        motor5 = hardwareMap.get(DcMotor.class, "Motor_5_CH");
    }

    public void spin(double power) {
        motor4.setPower(power);
        motor5.setPower(-power);
    }

}