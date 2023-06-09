package com.jsp.repository;

import com.jsp.entity.Dancer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 댄서 정보 저장소
public class DancerRepository {

    private static final Map<String, Dancer> dancerMap = new HashMap<>();

    // 댄서 저장 기능
    public void save(String name, String crewName, String danceLevel, String[] genresArray) {
        // Dancer 객체로 포장
        Dancer dancer = new Dancer();
        dancer.setName(name);
        dancer.setCrewName(crewName);
        dancer.setDanceLevel(Dancer.DanceLevel.valueOf(danceLevel));

        List<Dancer.Genre> genres = new ArrayList<>();
        if (genresArray != null) {
            for (String g : genresArray) {
                genres.add(Dancer.Genre.valueOf(g));
            }
        }
        dancer.setGenres(genres);

        dancerMap.put(name, dancer);
    }

    // 댄서 맵을 리스트로 변환해서 리턴하는 메서드
    public List<Dancer> findAll() {

        return new ArrayList<>(dancerMap.values());

    }

    // 댄서 맵에서 댄서 객체를 삭제하는 기능
    public void delete(String name) {
        dancerMap.remove(name);
    }

}
