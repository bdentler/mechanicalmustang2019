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

public class raiseBoom extends Command {

  int targetBoomPosition = 0;
  int targetCounts = 0;
  boolean countReached = false;

  public raiseBoom() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.m_boomMotor);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    if (Robot.boomLocked) {
      end();
    } else {
      Robot.boomLocked = true;
    }
    targetBoomPosition = Robot.currentBoomPosition + 1;
    if (targetBoomPosition > 5) {
      end();
    } else {
      Robot.m_boomMotor.resetBoomCounter();
      countReached = false;
      targetCounts = RobotMap.boomPositionCount[targetBoomPosition] - Robot.currentBoomPosition;
    }
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if (Robot.m_boomMotor.liftBoom() >= targetCounts) {
      countReached = true;
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return countReached;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.m_boomMotor.stopBoomMotor();
    Robot.boomLocked = false;
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
