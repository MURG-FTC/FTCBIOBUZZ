package org.firstinspires.ftc.teamcode; //place where the code is located (EST-korea, 2026)

/*

          ,  .-"""-.  ,
         / \/  _ _  \/ \
        /  /  (o o)  \  \
       /  |     ^     |  \
      /   |  \ ___ /  |   \
     /  /  \  '---'  /  \  \
    /  /    '.___.'    \  \
   /  /  .--|     |--.  \  \
  /__/__/   |  |  |   \__\__\
     /      |  |  |      \
    /_______|__|__|_______\

          LÕVI
        EI JAKSA
          ENAM

 */
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
@TeleOp(name = "BioBuzz")
public class BioBuzz extends LinearOpMode {

    private DcMotor motor0;
    private DcMotor motor1;

    private boolean MotorOn = false;

    private boolean LastXPressed = false;

    @Override
    public void runOpMode() {

        motor0 = hardwareMap.get(DcMotor.class, "Motor_0_CH");
        motor1 = hardwareMap.get(DcMotor.class, "Motor_1_CH");

        waitForStart();

        while (opModeIsActive()) {

            boolean currentXPressed = gamepad1.x;

            if (currentXPressed && !LastXPressed) {
                MotorOn = !MotorOn;
                if (MotorOn) {
                    motor0.setPower(1.0);
                    motor1.setPower(-1.0);
                } else {
                    motor0.setPower(0);
                    motor1.setPower(0);
                }

            }
            LastXPressed = currentXPressed;
        }
    }
}