/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.driveArcade;
import edu.wpi.first.wpilibj.Spark;

/**
 * Add your docs here.
 */
public class driveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public Spark leftDriveMotors = null;
  public Spark rightDriveMotors = null;
  DifferentialDrive differentialDrive = null;

  public driveTrain(){
    // initialize drive motor controllers
    leftDriveMotors = new Spark(RobotMap.DRIVETRAIN_LEFT_DRIVE_MOTORS_PWM);
    rightDriveMotors = new Spark(RobotMap.DRIVETRAIN_RIGHT_DRIVE_MOTORS_PWM);
    differentialDrive = new DifferentialDrive(leftDriveMotors, rightDriveMotors);
  }

  public void arcadeDrive(double moveSpeed, double rotateSpeed) {
    differentialDrive.arcadeDrive(moveSpeed, rotateSpeed);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new driveArcade());
  }
}
