<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <!-- モーダル・ダイアログ --> <div class="modal fade" id="sampleModal" tabindex="-1">  <div class="modal-dialog">   <div class="modal-content">    <div class="modal-header">     <button type="button" class="close" data-dismiss="modal">      <span>×</span>     </button>     <h4 class="modal-title">貸出確認</h4>    </div>    <form id="lend-modal" action="/library/booklendinglist/lendDecision" method="post">     <div class="modal-body">本文</div>     <div class="modal-footer">      <button type="button" class="btn btn-default" data-dismiss="modal">やめる</button>      <input class="btn btn-primary" type="submit" name="submit" value="決定" />      <input type="hidden" name="user_id" />      <input type="hidden" name="book_id" />     </div>    </form>   </div>  </div> </div>