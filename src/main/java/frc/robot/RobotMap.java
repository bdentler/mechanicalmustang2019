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
  public static final int CLIMBING_ARMS_FRONT_PWM = 2;            //Lift arms
  public static final int CLIMBING_ARMS_REAR_PWM = 3;             //Drop arms
  public static final int LIFT_DRIVE_WHEEL_PWM = 4;
  public static final int VACUUM_MOTOR_PWM = 5;
  public static final int BOOM_MOTOR_PWM = 6;

  // DIO Ports
  public static final int CLIMBING_ARMS_FRONT_DIO = 0;  //Lift arms
  public static final int CLIMBING_ARMS_REAR_DIO = 1;   //Drop arms
  public static final int BOOM_ARM_DIO = 2;             //Boom arm

  // Joystick Buttons
  public static final int LIFT_ROBOT_BUTTON = 1;    //lift robot onto platform
  public static final int LOWER_ROBOT_BUTTON = 2;   //lower robot from platform
  public static final int VACUUM_BEGIN_BUTTON = 3;  //start vacuum

  // Motor Speeds
  public static final double FRONT_ARM_LIFT_SPEED = 1;      //Lift arm
  public static final double FRONT_ARM_LOWER_SPEED = -1;    //Lift arm
  public static final double REAR_ARM_LIFT_SPEED = 1;       //Drop arm
  public static final double REAR_ARM_LOWER_SPEED = -1;     //Drop arm
  public static final double LIFT_DRIVE_WHEEL_SPEED = 0.6;  //Drive wheels on lift arm
  public static final double BOOM_MOTOR_RAISE_SPEED = -1; //Rotate boom upward when boom is in operating position
  public static final double BOOM_MOTOR_LOWER_SPEED = 1;  //Rotate boom downward when boom is in operating position

  // Motor Ramping adjustments (smaller numbers take more time to ramp up)
  public static final double SCALE_BACK_ROTATION_ACCELERATION = 0.8; //Drive train
  public static final double MAX_LINEAR_ACCELERATION = 0.1;           //Drive train
  public static final double VACUUM_MOTOR_SPEED_ADJUST = 0.004;

  // Motor Counters
  public static final int FRONT_LIFT_COUNTER_COUNT = 1000;  //Number of motor counts to reach correct position
  public static final int CLIMBING_ARMS_REAR_COUNT = 100;  //Number of motor counts to reach correct position
  public static final int BOOM_ARM_DEPLOY_COUNT = 5000;     //Number of motor counts to deploy boom arm from stowed position

  // Time Outs
  public static final double REAR_ARM_TIME = 7.0;           //Drop arm (after counts are working this is obsolete)
  public static final double FRONT_ARM_TIME = 5.0;          //Lift arm (after counts are working this is obsolete)
  public static final double LIFT_DRIVE_WHEEL_ON_TIME = 15; //Drive wheels on lift arm
  public static final double LIFT_DRIVE_WHEEL_OFF_TIME = 5; //Drive wheels on lift arm

  // Drive control joystick
  public static final int OI_DRIVE_JOYSTICK = 0;
  public static final int DRIVE_JOYSTICK_MOVE_AXIS = 1;
  public static final int DRIVE_JOYSTICK_ROTATE_AXIS = 0;

  // Function control joystick (xbox controller)
  public static final int OI_FUNCTION_JOYSTICK = 1;

}
