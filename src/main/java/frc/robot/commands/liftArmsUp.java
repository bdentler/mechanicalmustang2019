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

public class liftArmsUp extends Command {

  boolean countReached = false;

  public liftArmsUp() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.m_liftArms);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.m_liftArms.resetCounter();
    Robot.liftArmSameCount = 0;
    countReached = false;
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if (Robot.liftArmSameCount >= 5) {
      System.out.println("Lift arms hit stop");
      end();
    }
    int current = Robot.m_liftArms.raiseArm();
    if (Robot.liftArmLastCount == current) {
      Robot.liftArmSameCount += 1;
    } else {
      Robot.liftArmLastCount = current;
    }
    if (current >= RobotMap.LIFTARM_UP_COUNT) {
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
    Robot.m_liftArms.armsStop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
