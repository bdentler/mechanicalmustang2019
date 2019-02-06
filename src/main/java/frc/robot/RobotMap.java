/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  /*
  The motor names:
    Drive Train Left
    Drive Train Right
    Drop Arms
    Lift Arms
    Lift Drive
    Boom
    Wrist
  */
  
  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  // Drive motors
  public static final int DRIVETRAIN_LEFT_DRIVE_MOTORS = 0;   //PWM Port
  public static final int DRIVETRAIN_RIGHT_DRIVE_MOTORS = 1;  //PWM Port

  // Climbing arms
  public static final int LIFT_ROBOT_BUTTON = 1;  //Button number on function controller to lift robot onto platform
  public static final int LOWER_ROBOT_BUTTON = 2; //Button number on function controller to lower robot from platform

  public static final int CLIMBING_ARMS_FRONT = 2;  //PWM Port
  public static final int CLIMBING_ARMS_REAR_PWM = 3;   //PWM Port
  public static final int LIFT_DRIVE_WHEEL = 4;     //PWM Port

  public static final int CLIMBING_ARMS_FRONT_DIO = 0;
  public static final int CLIMBING_ARMS_REAR_DIO = 1;
  
  public static final double FRONT_ARM_LIFT_SPEED = 1;    //Lift arm
  public static final double FRONT_ARM_LOWER_SPEED = -1;  //Lift arm
  public static final double FRONT_ARM_TIME = 5.0;        //Lift arm

  public static final double REAR_ARM_LIFT_SPEED = 1;       //Drop arm
  public static final double REAR_ARM_LOWER_SPEED = -1;     //Drop arm
  public static final double REAR_ARM_TIME = 7.0;           //Drop arm (after counts are working this is obsolete)
  public static final int CLIMBING_ARMS_REAR_COUNT = 1000;  //Number of motor counts to reach correct position

  public static final double LIFT_DRIVE_WHEEL_SPEED = 0.6;  //Drive wheels on lift arm
  public static final double LIFT_DRIVE_WHEEL_ON_TIME = 15; //Drive wheels on lift arm
  public static final double LIFT_DRIVE_WHEEL_OFF_TIME = 5; //Drive wheels on lift arm

  // set to 1 to allow max rotation speed
  public static final double SCALE_BACK_ROTATION_ACCELERATION = 0.75;
  public static final double MAX_LINEAR_ACCELERATION = 0.1;

  // Vacuum System
  public static final int VACUUM_MOTOR = 5;                         //PWM Port
  public static final double VACUUM_MOTOR_SPEED_ADJUST = 0.004;
  public static final int VACUUM_BEGIN_BUTTON = 3;                  //Button number on function controller to start vacuum

  // Drive control joystick
  public static final int OI_DRIVE_JOYSTICK = 0;
  public static final int DRIVE_JOYSTICK_MOVE_AXIS = 1;
  public static final int DRIVE_JOYSTICK_ROTATE_AXIS = 0;

  // Function control joystick (xbox controller)
  public static final int OI_FUNCTION_JOYSTICK = 1;

}
