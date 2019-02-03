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
  public static final int CLIMBING_ARMS_FRONT = 2;  //PWM Port
  public static final int CLIMBING_ARMS_REAR = 3;   //PWM Port
  public static final double FRONT_ARM_LIFT_SPEED = 1;
  public static final double FRONT_ARM_LOWER_SPEED = -1;
  public static final double REAR_ARM_LIFT_SPEED = 1;
  public static final double REAR_ARM_LOWER_SPEED = -1;
  public static final double REAR_ARM_TIME = 7.0;
  public static final double FRONT_ARM_TIME = 5.0;

  // set to 1 to allow max rotation speed
  public static final double SCALE_BACK_ROTATION_ACCELERATION = 0.5;
  public static final double MAX_LINEAR_ACCELERATION = 0.1;

  // Drive control joystick
  public static final int OI_DRIVE_JOYSTICK = 0;
  public static final int DRIVE_JOYSTICK_MOVE_AXIS = 0;
  public static final int DRIVE_JOYSTICK_ROTATE_AXIS = 1;

  // Function control joystick (xbox controller)
  public static final int OI_FUNCTION_JOYSTICK = 1;


}
