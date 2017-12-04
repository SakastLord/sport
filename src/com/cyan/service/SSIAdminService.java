package com.cyan.service;

import com.cyan.entity.SSProject;
import com.cyan.entity.SSAdmin;
import com.cyan.entity.SSTeam;
import com.cyan.entity.SSAthlete;
import com.cyan.entity.SSJudge;

import java.util.List;

public interface SSIAdminService {public boolean login(String username, String pwd);

    public List<SSTeam> getAllSSTeams();

    public List<SSProject> getAllSSProjects();

    public boolean updateSSTeam(SSTeam SSTeam);

    public SSTeam getSSTeamById(String id);

    public boolean addSSTeam(SSTeam SSTeam);

    public void delSSTeam(String id);

    public boolean addSSProject(SSProject SSProject);

    public boolean updateSSProject(SSProject SSProject);

    public void delSSProject(String id);

    public SSProject getSSProjectById(String id);



}