package csd.uoc.gr.A23.battle;

import CallOfDuty.exception.MemberNotNull;
import CallOfDuty.exception.NameEmptyException;
import CallOfDuty.person.Character;
import CallOfDuty.person.Member;
import CallOfDuty.utilities.Utilities;

import java.util.ArrayList;
import java.util.List;

public class Group {
    String groupName;
    List<Member> members;

    public Group(String name) throws NameEmptyException {
        if(name.equals("")) throw new NameEmptyException();
        this.groupName = name;
        members = new ArrayList<Member>();
    }

    public String getGroupName(){
        return groupName;
    }

    public int getNumberOfAliveMembers(){
        int alive = 0;
        for (Member member : members) {
            if (member.isAlive()) {
                alive++;
            }
        }
        return alive;
    }

    public int getSize(){
        return members.size();
    }

    public boolean isDefeated(){
        return getNumberOfAliveMembers() == 0;
    }

    public Member pickRandomAliveMember(){
        Member member = members.get(Utilities.getRandomVal(0,members.size()-1));
        while(!member.isAlive() && !isDefeated()){
            member = members.get(Utilities.getRandomVal(0,members.size()-1));
        }
        if(isDefeated()){
            return null;
        }
        return member;
    }

    public void addMember(Character member) throws MemberNotNull {
        if(member == null) throw new MemberNotNull();
        members.add((Member) member);
    }
}
