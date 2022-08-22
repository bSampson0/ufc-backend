package com.app.ufc.fighter;

import javax.persistence.*;

@Entity
@Table(name = "fighters")
public class Fighter {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="date")
    private String date;
    @Column(name="fight_pk")
    private long fight_pk;
    @Column(name="fighter")
    private String fighter;
    @Column(name="kd")
    private int kd;
    @Column(name="kds_received")
    private int kds_received;
    @Column(name = "method")
    private String method;
    @Column(name = "pass")
    private int pass;
    @Column(name = "res")
    private String res;
    @Column(name = "rev")
    private String rev;
    @Column(name = "round_finished")
    private int round_finished;
    @Column(name = "rounds")
    private int rounds;
    @Column(name = "sig_reg_mixture")
    private String sig_reg_mixture;
    @Column(name = "sig_reg_percent")
    private String sig_reg_percent;
    @Column(name = "sig_strike_attempts")
    private int sig_strike_attempts;
    @Column(name = "sig_strike_landed")
    private int sig_strike_landed;
    @Column(name = "sig_strike_percent")
    private String sig_strike_percent;
    @Column(name = "sig_strikes_avoided")
    private int sig_strikes_avoided;
    @Column(name = "sig_strikes_received")
    private int sig_strikes_received;
    @Column(name = "strike_attempts")
    private int strike_attempts;
    @Column(name = "strike_landed")
    private int strike_landed;
    @Column(name = "strike_percent")
    private String strike_percent;
    @Column(name = "strikes_avoided")
    private int strikes_avoided;
    @Column(name = "strikes_received")
    private int strikes_received;
    @Column(name = "sub_attempts")
    private int sub_attempts;
    @Column(name = "td_attempts")
    private int td_attempts;
    @Column(name = "td_landed")
    private int td_landed;
    @Column(name = "tds_percent")
    private String tds_percent;
    @Column(name = "tds_defended")
    private int tds_defended;
    @Column(name = "tds_received")
    private int tds_received;
    @Column(name = "time")
    private String time;
    @Column(name = "weight_class")
    private String weight_class;

    public Fighter() {
        super();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getFight_pk() {
        return fight_pk;
    }

    public void setFight_pk(long fight_pk) {
        this.fight_pk = fight_pk;
    }

    public String getFighter() {
        return fighter;
    }

    public void setFighter(String fighter) {
        this.fighter = fighter;
    }

    public int getKd() {
        return kd;
    }

    public void setKd(int kd) {
        this.kd = kd;
    }

    public int getKds_received() {
        return kds_received;
    }

    public void setKds_received(int kds_received) {
        this.kds_received = kds_received;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public String getRev() {
        return rev;
    }

    public void setRev(String rev) {
        this.rev = rev;
    }

    public int getRound_finished() {
        return round_finished;
    }

    public void setRound_finished(int round_finished) {
        this.round_finished = round_finished;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public String getSig_reg_mixture() {
        return sig_reg_mixture;
    }

    public void setSig_reg_mixture(String sig_reg_mixture) {
        this.sig_reg_mixture = sig_reg_mixture;
    }

    public String getSig_reg_percent() {
        return sig_reg_percent;
    }

    public void setSig_reg_percent(String sig_reg_percent) {
        this.sig_reg_percent = sig_reg_percent;
    }

    public int getSig_strike_attempts() {
        return sig_strike_attempts;
    }

    public void setSig_strike_attempts(int sig_strike_attempts) {
        this.sig_strike_attempts = sig_strike_attempts;
    }

    public int getSig_strike_landed() {
        return sig_strike_landed;
    }

    public void setSig_strike_landed(int sig_strike_landed) {
        this.sig_strike_landed = sig_strike_landed;
    }

    public String getSig_strike_percent() {
        return sig_strike_percent;
    }

    public void setSig_strike_percent(String sig_strike_percent) {
        this.sig_strike_percent = sig_strike_percent;
    }

    public int getSig_strikes_avoided() {
        return sig_strikes_avoided;
    }

    public void setSig_strikes_avoided(int sig_strikes_avoided) {
        this.sig_strikes_avoided = sig_strikes_avoided;
    }

    public int getSig_strikes_received() {
        return sig_strikes_received;
    }

    public void setSig_strikes_received(int sig_strikes_received) {
        this.sig_strikes_received = sig_strikes_received;
    }

    public int getStrike_attempts() {
        return strike_attempts;
    }

    public void setStrike_attempts(int strike_attempts) {
        this.strike_attempts = strike_attempts;
    }

    public int getStrike_landed() {
        return strike_landed;
    }

    public void setStrike_landed(int strike_landed) {
        this.strike_landed = strike_landed;
    }

    public String getStrike_percent() {
        return strike_percent;
    }

    public void setStrike_percent(String strike_percent) {
        this.strike_percent = strike_percent;
    }

    public int getStrikes_avoided() {
        return strikes_avoided;
    }

    public void setStrikes_avoided(int strikes_avoided) {
        this.strikes_avoided = strikes_avoided;
    }

    public int getStrikes_received() {
        return strikes_received;
    }

    public void setStrikes_received(int strikes_received) {
        this.strikes_received = strikes_received;
    }

    public int getSub_attempts() {
        return sub_attempts;
    }

    public void setSub_attempts(int sub_attempts) {
        this.sub_attempts = sub_attempts;
    }

    public int getTd_attempts() {
        return td_attempts;
    }

    public void setTd_attempts(int td_attempts) {
        this.td_attempts = td_attempts;
    }

    public int getTd_landed() {
        return td_landed;
    }

    public void setTd_landed(int td_landed) {
        this.td_landed = td_landed;
    }

    public String getTds_percent() {
        return tds_percent;
    }

    public void setTds_percent(String tds_percent) {
        this.tds_percent = tds_percent;
    }

    public int getTds_defended() {
        return tds_defended;
    }

    public void setTds_defended(int tds_defended) {
        this.tds_defended = tds_defended;
    }

    public int getTds_received() {
        return tds_received;
    }

    public void setTds_received(int tds_received) {
        this.tds_received = tds_received;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWeight_class() {
        return weight_class;
    }

    public void setWeight_class(String weight_class) {
        this.weight_class = weight_class;
    }
}
