package com.cyan.service.Impl;

import com.cyan.dao.IAdminDao;
import com.cyan.dao.SSIAdminDao;
import com.cyan.entity.SSAdmin;
import com.cyan.entity.SSProject;
import com.cyan.entity.SSTeam;
import com.cyan.service.SSIAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述:
 *
 * @Author cyan
 * @Date 16/7/8.
 */

@Service
public class SSAdminService implements SSIAdminService {

    @Autowired
    private SSIAdminDao ssadminDao;


    @Override
    public boolean login(String username, String pwd) {
        SSAdmin ssadmin = ssadminDao.selectById(username);
        if (ssadmin != null && ssadmin.getPwd().equals(pwd)) {
            return true;
        }
        return false;
    }

    @Override
    public List<SSTeam> getAllSSTeams() {
        return ssadminDao.selectAllSSTeams();
    }

    @Override
    public List<SSProject> getAllSSProjects() {
        return ssadminDao.selectAllSSProjects();
    }

    @Override
    public boolean updateSSTeam(SSTeam ssteam) {
        if (ssteam.getId() != null && ssteam.getId().length() != 0) {
            String name = ssteam.getTeamName().trim();
            if (name != null && name.length() <= 20 && name.length() > 0) {
                String pwd = ssteam.getPwd().trim();
                if (pwd != null && pwd.length() <= 20 && pwd.length() > 0) {
                    String leaderName = ssteam.getLeaderName().trim();
                    if (leaderName != null && leaderName.length() <= 100 && leaderName.length() > 0) {
                       /* String year = ssteam.getYear();
                        if (year.length() == 4) {
                            for (int i = 0; i < 4; i++) {
                                if (year.charAt(i) > '9' || year.charAt(i) < '0')
                                    return false;
                            }
                            adminDao.updateSSTeam(ssteam);
                            return true;
                        }*/
                        {
                            ssadminDao.updateSSTeam(ssteam);
                            return true;
                        }

                    }
                }
            }
        }
        return false;
    }

    @Override
    public SSTeam getSSTeamById(String id) {
        return ssadminDao.selectSSTeamById(id);
    }

    @Override
    public boolean addSSTeam(SSTeam ssteam) {
        if (ssteam.getId() != null && ssteam.getId().length() != 0) {
            String name = ssteam.getTeamName().trim();
            if (name != null && name.length() <= 20 && name.length() > 0) {
                String pwd = ssteam.getPwd().trim();
                if (pwd != null && pwd.length() <= 20 && pwd.length() > 0) {
                    String leaderName = ssteam.getLeaderName().trim();
                    if (leaderName != null && leaderName.length() <= 100 && leaderName.length() > 0) {
                        //if (major != null && major.length() <= 100 && major.length() > 0) {
                           /* String year = ssteam.getYear();
                            if (year.length() == 4) {
                                for (int i = 0; i < 4; i++) {
                                    if (year.charAt(i) > '9' || year.charAt(i) < '0')
                                        return false;
                                }
                                if(Integer.parseInt(year)>=1900) {
                                    adminDao.addSSTeam(ssteam);
                                    return true;
                                }
                            }
                            */
                            {
                                ssadminDao.addSSTeam(ssteam);
                                return true;
                            }

                      //  }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void delSSTeam(String id) {
        ssadminDao.delSSTeam(id);
    }

    @Override
    public boolean addSSProject(SSProject ssproject) {
        String name=ssproject.getName();
        if(name.length()>0&&name.length()<=100){
            String time=ssproject.getTime();
            if(time.length()>0&&time.length()<=20){
              //  for (int i = 0; i < time.length(); i++) {
                  /*  if (time.charAt(i) > '9' || time.charAt(i) < '0')
                        if(time.charAt(i)!='('&&time.charAt(i)!=')'&&time.charAt(i)!='/'){
                            return false;
                        }
                        */

               // }
                String id=ssproject.getId();
                if(id.length()>0&&id.length()<=20){
                   // String detail=ssproject.getDetail();
                   // if(detail.length()>0&&detail.length()<=200){
                        //String place=ssproject.getPlace();
                       // if(place.length()>0&&place.length()<=30){
                            ssadminDao.addSSProject(ssproject);
                            return true;
                       // }
                   // }
                }
            }
        }
        return false;
    }

    @Override
    public void delSSProject(String id) {
        ssadminDao.delSSProject(id);
        //ssadminDao.delStudyInfoByCId(id);
    }

    @Override
    public SSProject getSSProjectById(String id) {
        return ssadminDao.selectSSProjById(id);
    }

    @Override
    public boolean updateSSProject(SSProject ssproject) {
        String name=ssproject.getName();
        if(name.length()>0&&name.length()<=100){
            String time=ssproject.getTime();
            if(time.length()>0&&time.length()<=20){
                //  for (int i = 0; i < time.length(); i++) {
                  /*  if (time.charAt(i) > '9' || time.charAt(i) < '0')
                        if(time.charAt(i)!='('&&time.charAt(i)!=')'&&time.charAt(i)!='/'){
                            return false;
                        }
                        */

                // }
                String id=ssproject.getId();
                if(id.length()>0&&id.length()<=20){
                    // String detail=ssproject.getDetail();
                    // if(detail.length()>0&&detail.length()<=200){
                    //String place=ssproject.getPlace();
                    // if(place.length()>0&&place.length()<=30){
                    ssadminDao.updateSSProject(ssproject);
                    return true;
                    // }
                    // }
                }
            }
        }
        return false;
    }


}
