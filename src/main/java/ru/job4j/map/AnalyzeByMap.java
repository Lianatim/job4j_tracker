package ru.job4j.map;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double score = 0;
        double count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
                count++;
            }
        }
        return score / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> averageScoreByPupil = new ArrayList<>();
        Label pupilScore;
        double score = 0;
        double count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
                count++;
            }
            pupilScore = new Label(pupil.name(), score / count);
            averageScoreByPupil.add(pupilScore);
            score = 0;
            count = 0;
        }
        return averageScoreByPupil;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> averageScoreBySubject = new ArrayList<>();
        HashMap<String, ArrayList<Integer>> subjectScore = new HashMap<>();
        Label subjectSc;
        double count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                if (subject.name() != null) {
                    if (!subjectScore.containsKey(subject.name())) {
                        subjectScore.put(subject.name(), new ArrayList<>());
                    }
                    subjectScore.get(subject.name()).add(subject.score());
                }
            }
        }
        for (String key : subjectScore.keySet()) {
            ArrayList<Integer> values = subjectScore.get(key);
            Integer sumValue = 0;
            for (Integer value : values) {
                sumValue += value;
                count++;
            }
            subjectSc = new Label(key, sumValue / count);
            averageScoreBySubject.add(subjectSc);
            count = 0;
        }
        return averageScoreBySubject;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> scoreByPupil = new ArrayList<>();
        Label pupilScore;
        double score = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
            }
            pupilScore = new Label(pupil.name(), score);
            scoreByPupil.add(pupilScore);
            score = 0;
        }
        scoreByPupil.sort(Comparator.naturalOrder());

        return scoreByPupil.get(scoreByPupil.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> averageScoreBySubject = new ArrayList<>();
        HashMap<String, ArrayList<Integer>> subjectScore = new HashMap<>();
        Label subjectSc;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                if (subject.name() != null) {
                    if (!subjectScore.containsKey(subject.name())) {
                        subjectScore.put(subject.name(), new ArrayList<>());
                    }
                    subjectScore.get(subject.name()).add(subject.score());
                }
            }
        }
        for (String key : subjectScore.keySet()) {
            ArrayList<Integer> values = subjectScore.get(key);
            Integer sumValue = 0;
            for (Integer value : values) {
                sumValue += value;
            }
            subjectSc = new Label(key, sumValue);
            averageScoreBySubject.add(subjectSc);
        }
        averageScoreBySubject.sort(Comparator.naturalOrder());
        return averageScoreBySubject.get(averageScoreBySubject.size() - 1);
    }
}
