<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
			    


    <table>
        <tr>
            <th>섭취일자</th>
            <th>식품코드</th>
            <th>식품명</th>
            <th>섭취량</th>
            <th>제공량</th>
            <th>내용량</th>
            <th>탄수화물</th>
            <th>지방</th>
            <th>당류</th>
            <th>단백질</th>
            <th>칼로리</th>
        </tr>
        <c:forEach items="${MFOODS}" var="MF">
        <tr>
            <td>${MF.mf_date}</td>
            <td>${MF.mf_fcode}</td>
            <td>${MF.mf_fname}</td>
            <td>${MF.mf_amt}</td>
            <td>${MF.mf_once}</td>
            <td>${MF.mf_capa}</td>
            <td>${MF.mf_carbo}</td>
            <td>${MF.mf_fat}</td>
            <td>${MF.mf_sugar}</td>
            <td>${MF.mf_protein}</td>
            <td>${MF.mf_cal}</td>
        </tr>
        </c:forEach>
    </table>    
