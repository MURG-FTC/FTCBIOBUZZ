package org.firstinspires.ftc.teamcode; //place where the code is located (EST-korea, 2026)

/*

   \|\||
  -' ||||/
 /7   |||||/
/    |||||||/`-.____________
\-' |||||||||               `-._
 -|||||||||||               |` -`.
   ||||||               \   |   `\\
    |||||\  \______...---\_  \    \\
       |  \  \           | \  |    ``-.__--.
       |  |\  \         / / | |       ``---'
     _/  /_/  /      __/ / _| |
    (,__/(,__/      (,__/ (,__/
          LÕVI
        EI JAKSA
          ENAM

 */
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.mainModules.TurretTesting;

@TeleOp(name = "BioBuzz")
public class BioBuzz extends LinearOpMode {


    private TurretTesting turret;
    private boolean MotorOn = false;

    private boolean LastXPressed = false;

    @Override
    public void runOpMode() {

        turret = new TurretTesting(hardwareMap);

        waitForStart();

        while (opModeIsActive()) {

            boolean currentXPressed = gamepad1.x;
            if (currentXPressed && !LastXPressed) {
                MotorOn = !MotorOn;
            }
            if (MotorOn) {
                turret.spin(1.0);
            } else {
                turret.spin(0);
            }
            LastXPressed = currentXPressed;
        }
        turret.spin(0);
    }
}