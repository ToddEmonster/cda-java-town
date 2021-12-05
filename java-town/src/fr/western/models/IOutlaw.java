package fr.western.models;

public interface IOutlaw {
    public String getName();
    public void kidnap(Sir sir);
    public void getCapturedBy(Cowgirl heroin);
    public int getReward();
    public void setReward(int reward);
    public boolean isInJail();
    public int getNumberOfKidnappings();
}
