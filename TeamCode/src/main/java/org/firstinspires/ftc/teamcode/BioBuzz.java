package org.firstinspires.ftc.teamcode; //place where the code is located (EST-korea, 2026)

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
@TeleOp(name = "BioBuzz")
public class BioBuzz extends LinearOpMode {

    private DcMotor motor0;
    private DcMotor motor1;

    @Override
    public void runOpMode() {

        motor0 = hardwareMap.get(DcMotor.class, "Motor_0_CH");
        motor1 = hardwareMap.get(DcMotor.class, "Motor_1_CH");

        waitForStart();

        while (opModeIsActive()) {
            motor0.setPower(1.0);
            motor1.setPower(-1.0);
        }

        motor0.setPower(0);
        motor1.setPower(0);
    }
}