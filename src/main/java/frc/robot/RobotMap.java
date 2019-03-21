/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

public class RobotMap {

  // PWM Ports
  public static final int DRIVETRAIN_LEFT_DRIVE_MOTORS_PWM = 0;
  public static final int DRIVETRAIN_RIGHT_DRIVE_MOTORS_PWM = 1;
  public static final int BOOM_MOTOR_PWM = 2;
  public static final int CANDY_CANE_PWM = 3;
  public static final int LIFT_DRIVE_WHEEL_PWM = 4;
  public static final int VACUUM_MOTOR_PWM = 5;
  public static final int LIFT_ARMS_PWM = 6;
  public static final int WRIST_MOTOR_PWM = 7;
  public static final int CANDY_CANE_DRIVE_WHEEL_PWM = 8;

  // DIO Ports
  public static final int LIFT_ARMS_DIO = 0;
  public static final int CANDY_CANE_DIO = 1;
  public static final int BOOM_ARM_DIO = 2;
  public static final int WRIST_MOTOR_DIO = 3;
  public static final int LIFT_DRIVE_WHEEL_DIO = 4;
  public static final int CANDY_CANE_DRIVE_DIO = 5;

  // Relay Ports
  public static final int VACUUM_DUMP_RELAY_PORT = 0;   //Connect relay across Forward and Ground (Center)--reverse pin not used
  //public static final int VACUUM_RELAY_PORT = 1;

  // Motor Speeds
  public static final double LIFT_ARM_DOWN_SPEED = -1.0;
  public static final double LIFT_ARM_UP_SPEED = 0.6;
  public static final double CANDY_CANE_DOWN_SPEED = -1.0;
  public static final double CANDY_CANE_UP_SPEED = 0.6;
  public static final double LIFT_DRIVE_WHEEL_ON_SPEED = -0.7;
  public static final double LIFT_DRIVE_WHEEL_OFF_SPEED = 0.6;
  public static final double CANDY_CANE_DRIVE_ON_SPEED = 0.8;
  public static final double CANDY_CANE_DRIVE_OFF_SPEED = -0.6;
  public static final double BOOM_MOTOR_RAISE_SPEED = -0.7;
  public static final double BOOM_MOTOR_LOWER_SPEED = 0.7;
  public static final double WRIST_MOTOR_UP_SPEED = 0.7;
  public static final double WRIST_MOTOR_DOWN_SPEED = -0.5;
  public static final double VACUUM_MAX_SPEED = 0.8;
  public static final double VACUUM_RAMP = 0.04;

  // Motor Counters
    //climb down
  public static final int LIFTARM_DOWN_COUNT = 300;
  public static final int LIFTARM_UP_COUNT = 300;
  public static final int CANDYCANES_DOWN_COUNT = 280;
  public static final int CANDYCANES_UP_COUNT = 280;
  public static final int LIFT_DRIVE_OFF_COUNT = 80;
  public static final int CANDY_CANE_DRIVE_OFF_COUNT = 80;

    //climb up level 2
  public static final int LIFTARM_DOWN_COUNT2 = 360;
  public static final int LIFTARM_UP_COUNT2 = 360;
  public static final int CANDYCANES_DOWN_COUNT2 = 140;
  public static final int CANDYCANES_UP_COUNT2 = 280;
  //public static final int LIFT_DRIVE_ON_COUNT2 = 400;
  //public static final int CANDY_CANE_DRIVE_ON_COUNT2 = 400;

    //climb up level 3
  public static final int LIFTARM_DOWN_COUNT3 = 360;
  public static final int LIFTARM_UP_COUNT3 = 360;
  public static final int CANDYCANES_DOWN_COUNT3 = 190;
  public static final int CANDYCANES_UP_COUNT3 = 380;
  //public static final int LIFT_DRIVE_ON_COUNT3 = 400;
  //public static final int CANDY_CANE_DRIVE_ON_COUNT3 = 400;

    //remaining motor counters
  public static final int BOOM_ARM_DEPLOY_COUNT = 479;
  public static final int WRIST_DEPLOY_COUNT = 240;
  public static final int[] boomPositionCount = {0, 33, 82, 117, 158, 213};

  // Time Outs
  public static final double VACUUM_DUMP_TIMEOUT = 2;       //Length of time in seconds that vacuum is dumped
  public static final double DRIVE_OFF_HABITAT_TIME = 2;    //Turn on main drive wheels for this number of seconds
  public static final double DRIVE_OFF_UPPER_HABITAT = 3;

  // Drive control joystick
  public static final int OI_DRIVE_JOYSTICK = 0;
  public static final int DRIVE_JOYSTICK_MOVE_AXIS = 1;
  public static final int DRIVE_JOYSTICK_ROTATE_AXIS = 0;

  // Function control joystick (xbox controller)
  public static final int OI_FUNCTION_JOYSTICK = 1;

}
