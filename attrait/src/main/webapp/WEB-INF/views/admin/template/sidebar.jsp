<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>

<!DOCTYPE html>
<html>
<head>
    
</head>
<body>

	<!-- 상단 메뉴 -->


        <!-- Sidebar -->
        <div class="navbar-default sidebar" role="navigation">
            <div class="sidebar-nav navbar-collapse">

                <ul class="nav" id="side-menu">
                    <li class="sidebar-search">
                        <div class="input-group custom-search-form">
                            <input type="text" class="form-control" placeholder="Search...">
                                <span class="input-group-btn">
                                    <button class="btn btn-primary" type="button">
                                        <i class="fa fa-search"></i>
                                    </button>
                                </span>
                        </div>
                    </li>
                    
                    <li>
                        <a href="${root }/admin/user/list" class="active"><i class="glyphicon glyphicon-user"></i> User</a>
                    </li>
                    
                    <li>
                        <a href="${root }/admin/category/list"><i class="fa fa-sitemap fa-fw"></i> Menu&Category</a>
                    </li>
                    
                    <li>
                        <a href="#"><i class="fa fa-sitemap fa-fw"></i> Product<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="${root }/admin/pdt/list">List</a>
                            </li>
                            <li>
                                <a href="${root }/admin/pdt/create">Create</a>
                            </li>
                        </ul>
                    </li>
                    
                    <li>
                        <a href="${root }/admin/order/list"><i class="fa fa-sitemap fa-fw"></i> Order</a>
                    </li>
                   
                    <li>
                        <a href="#"><i class="fa fa-sitemap fa-fw"></i> Sale<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="${root }/admin/sale/list">List</a>
                            </li>
                            <li>
                                <a href="${root }/admin/sale/day">Day Statistics</a>
                            </li>
                            <li>
                                <a href="${root }/admin/sale/month">Month Statistics</a>
                            </li>
                            <li>
                                <a href="${root }/admin/sale/pdt">Product Statistics</a>
                            </li>
                        </ul>
                    </li>
                  
                    <li>
                        <a href="#"><i class="fa fa-sitemap fa-fw"></i> Service<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="${root }/admin/admin_board/list">공지사항</a>
                            </li>
                            <li>
                                <a href="${root }/admin/user_board/list">Q&A</a>
                            </li>
                            <li>
                                <a href="#">문의 게시판<span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="${root }/admin/admin_board/email">E-mail문의</a>
                                    </li>
                                    <li>
                                        <a href="${root }/admin/admin_board/live">실시간 상담</a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                </ul>

            </div>
        </div>

	<!-- 상단 메뉴 끝 -->

</body>
</html>
