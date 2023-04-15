/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ASUS
 */
public class QuanLiCanBo {

    private List<CanBo> canbos = new ArrayList<>();

    public void addcanbo(CanBo canbo) {
        this.canbos.add(canbo);
    }

    /*this.canbos là danh sách các cán bộ được lưu trữ trong lớp hiện tại.
stream() chuyển đổi danh sách này thành một chuỗi dữ liệu trên đó có thể áp dụng các phương thức xử lý dữ liệu khác.
filter(o -> o.getHoten().contains(name)) chọn các phần tử trong chuỗi dữ liệu thỏa mãn điều kiện, trong trường hợp này là các cán bộ có tên chứa chuỗi name.
collect(Collectors.toList()) thu thập các phần tử được chọn vào một danh sách và trả về kết quả.*/
    public List<CanBo> seacrhCanBo(String name) {
        return this.canbos.stream().filter(o -> o.getHoten().contains(name)).collect(Collectors.toList());
    }
    /*
    this.canbos là danh sách các cán bộ được lưu trữ trong lớp hiện tại.
forEach(o -> System.out.println(o.toString())) duyệt qua từng phần tử trong danh sách và thực hiện một hành động trên mỗi phần tử đó, trong trường hợp này là in thông tin cán bộ ra màn hình.
o -> System.out.println(o.toString()) là một biểu thức lambda để thực hiện hành động in thông tin cán bộ ra màn hình.
o.toString() là phương thức của đối tượng o để chuyển đổi đối tượng thành một chuỗi đại diện cho đối tượng đó, giúp in thông tin của đối tượng ra màn hình.
    */
    
    public void showlistInforCanbo(){
        this.canbos.forEach(o -> System.out.println(o.toString()));
    }

}
