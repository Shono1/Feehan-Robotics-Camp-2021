package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class TeleOp extends OpMode {
    private DcMotor frontRight, frontLeft, backRight, backLeft;

    @Override
    public void init() {
        frontRight = hardwareMap.get(DcMotor.class, "fr");
        frontLeft = hardwareMap.get(DcMotor.class, "fl");
        backRight = hardwareMap.get(DcMotor.class, "br");
        backLeft = hardwareMap.get(DcMotor.class, "bl");
    }

    @Override
    public void loop() {
//        frontRight.setPower(gamepad1.left_stick_y);
//        backRight.setPower(gamepad1.left_stick_y);
//        frontLeft.setPower(-gamepad1.left_stick_y);
//        backLeft.setPower(-gamepad1.left_stick_y);

//        frontRight.setPower(gamepad1.left_stick_x);
//        backRight.setPower(-gamepad1.left_stick_x);
//        frontLeft.setPower(gamepad1.left_stick_x);
//        backLeft.setPower(-gamepad1.left_stick_x);

        frontRight.setPower(gamepad1.right_stick_x);
        backRight.setPower(gamepad1.right_stick_x);
        frontLeft.setPower(gamepad1.right_stick_x);
        backLeft.setPower(gamepad1.right_stick_x);
    }
}
