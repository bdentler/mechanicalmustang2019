/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class liftDriveOn3 extends Command {

  boolean isCountReached = false;

  public liftDriveOn3() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.m_liftDriveWheel);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.m_liftDriveWheel.resetLiftDriveCounter();
    isCountReached = false;
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if (Robot.m_liftDriveWheel.driveOn() >= RobotMap.LIFT_DRIVE_ON_COUNT3) {
      isCountReached = true;
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return isCountReached;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.m_liftDriveWheel.driveStop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
