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
  public static final int CLIMBING_ARMS_FRONT_PWM = 6;            //Lift arms
  public static final int CLIMBING_ARMS_REAR_PWM = 3;             //Drop arms
  public static final int LIFT_DRIVE_WHEEL_PWM = 4;
  public static final int VACUUM_MOTOR_PWM = 5;
  public static final int BOOM_MOTOR_PWM = 2;
  public static final int WRIST_MOTOR_PWM = 7;

  // DIO Ports
  public static final int CLIMBING_ARMS_FRONT_DIO = 0;  //Lift arms
  public static final int CLIMBING_ARMS_REAR_DIO = 1;   //Drop arms
  public static final int BOOM_ARM_DIO = 2;             //Boom arm
  public static final int WRIST_MOTOR_DIO = 3;
  public static final int LIFT_DRIVE_WHEEL_DIO = 4;
  public static final int BOOM_PROX_IO = 5;

  // Relay Ports
  public static final int VACUUM_DUMP_RELAY_PORT = 0;   //Connect relay across Forward and Ground (Center)--reverse pin not used

  // Motor Speeds
  public static final double FRONT_ARM_LIFT_SPEED = -1.0;   //Lift arm
  public static final double FRONT_ARM_LOWER_SPEED = 0.7;   //Lift arm
  public static final double REAR_ARM_LIFT_SPEED = -1.0;    //Drop arm
  public static final double REAR_ARM_LOWER_SPEED = 0.7;    //Drop arm
  public static final double LIFT_DRIVE_WHEEL_ON_SPEED = 0.8;     //Drive wheels on lift arm
  public static final double LIFT_DRIVE_WHEEL_OFF_SPEED = -0.6;   //Drive wheels on lift arm
  public static final double BOOM_MOTOR_RAISE_SPEED = -0.7;   //Rotate boom upward when boom is in operating position
  public static final double BOOM_MOTOR_LOWER_SPEED = 0.7;    //Rotate boom downward when boom is in operating position
  public static final double WRIST_MOTOR_UP_SPEED = 0.7;      //Rotate wrist upward
  public static final double WRIST_MOTOR_DOWN_SPEED = -0.5;   //Rotate wrist downward

  // Motor Ramping adjustments (smaller numbers take more time to ramp up)
  public static final double VACUUM_MOTOR_SPEED_ADJUST = 0.001;
  public static final double VACUUM_MOTOR_MAX_SPEED = 1;
  //public static final double BOOM_MOTOR_SPEED_ADJUST = 0.03;

  // Motor Counters
  public static final int FRONT_LIFT_COUNTER_COUNT = 300;   //lift arm deploy
  public static final int FRONT_STOW_COUNTER_COUNT = 300;   //lift arm stow 
  public static final int CLIMBING_ARMS_REAR_COUNT = 280;   //drop arm deploy
  public static final int CLIMBING_ARMS_STOW_COUNT = 280;   //drop arm stow

  public static final int FRONT_LIFT_END_COUNTER_COUNT = 360;   //lift arm deploy END
  public static final int FRONT_STOW_END_COUNTER_COUNT = 360;   //lift arm stow END
  public static final int CLIMBING_ARMS_END_REAR_COUNT = 220;   //drop arm deploy END
  public static final int CLIMBING_ARMS_END_STOW_COUNT = 440;   //drop arm stow END

  public static final int LIFT_DRIVE_OFF_COUNT = 80;         //lift arm drive wheel count driving off
  public static final int LIFT_DRIVE_ON_COUNT = 500;          //lift arm drive wheel count driving on
  public static final int BOOM_ARM_DEPLOY_COUNT = 379;      //boom arm deploy from stowed position
  public static final int WRIST_DEPLOY_COUNT = 200;          //wrist deploy from stow and back to stow
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
